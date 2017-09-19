package dae.music.parser;

import dae.music.data.Alteration;
import dae.music.data.BooleanProperty;
import dae.music.data.IntProperty;
import dae.music.data.Key;
import dae.music.data.Measure;
import dae.music.data.Note;
import dae.music.data.NoteType;
import dae.music.data.Part;
import dae.music.data.Property;
import dae.music.data.Score;
import dae.music.data.StringProperty;
import dae.music.data.Voice;
import dae.music.parser.MusicScriptParser.NoteContext;
import dae.music.parser.MusicScriptParser.NotegroupContext;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Koen.Samyn
 */
public class DaeMusicScriptVisitor extends MusicScriptBaseVisitor {
    Pattern lyricSplitter = Pattern.compile("(?<=[-])|[ ]");
    
    
   
    
    @Override
    public Object visitScore(MusicScriptParser.ScoreContext ctx) {
        Score score = new Score();
        List<Property> properties
                = ctx.property().stream().map(p -> visitProperty(p)).collect(Collectors.toList());
        score.addProperties(properties);
        List<Part> parts
                = ctx.part().stream().map(part -> visitPart(part)).collect(Collectors.toList());
        score.addParts(parts);
        return score;
    }

    @Override
    public Part visitPart(MusicScriptParser.PartContext ctx) {
        Part p = new Part();
        p.setId(ctx.ID().getText());
        List<Property> properties
                = ctx.property().stream().map(prop -> visitProperty(prop)).collect(Collectors.toList());
        p.addProperties(properties);

        List<Voice> voices
                = ctx.voice().stream().map(prop -> visitVoice(prop)).collect(Collectors.toList());
        p.addVoices(voices);

        return p;
    }

    @Override
    public Voice visitVoice(MusicScriptParser.VoiceContext ctx) {
        int id = Integer.parseInt(ctx.INT().getText());
        Voice v = new Voice(id);

        List<Measure> measures
                = ctx.measure().stream().map(m -> visitMeasure(m)).collect(Collectors.toList());
        v.addMeasures(measures);
        return v;
    }

    @Override
    public Measure visitMeasure(MusicScriptParser.MeasureContext ctx) {
        Measure m = new Measure();

        if (ctx.clef() != null) {
            m.setClef(ctx.clef().getText());
        }
        
        if (ctx.fifths() != null){
            int fifths = Integer.parseInt(ctx.fifths().INT().getText());
            if ( ctx.fifths().MINUS() != null){
                fifths = -fifths;
            }
            Key k = Key.createFifths(fifths);
            m.setKey(k);
        }

        if (ctx.time() != null) {
            int beat = Integer.parseInt(ctx.time().INT(0).getText());
            int beatType = Integer.parseInt(ctx.time().INT(1).getText());
            m.setTime(beat, beatType);
        }

        for(int i = 0; i < ctx.getChildCount(); ++i){
            ParseTree c = ctx.getChild(i);
            if ( c instanceof NoteContext){
                m.addNote(visitNote((NoteContext)c));
            }else if (c instanceof NotegroupContext){
                m.addNotes(visitNotegroup((NotegroupContext)c));
            }
        }
        
        List<String> lyrics 
                = ctx.lyrics().stream().map(l ->visitLyrics(l)).collect(Collectors.toList());
        
        for ( String s : lyrics)
        {
            
           String[] syllables = lyricSplitter.split(s.substring(1,s.length()-1));
           int max = Math.min(syllables.length, m.getNumberOfNotes());
           for ( int i = 0; i < max; ++i)
           {               
               Note n = m.getNote(i);
               n.addLyric(syllables[i]);
           }
        }
        return m;
    }

    @Override
    public Property visitProperty(MusicScriptParser.PropertyContext ctx) {

        if (ctx.BOOLEAN() != null) {
            BooleanProperty bp = new BooleanProperty(ctx.ID().getText());
            bp.setValue(Boolean.valueOf(ctx.BOOLEAN().getText()));
            return bp;
        } else if (ctx.STRING() != null) {
            String s = ctx.STRING().getText();
            StringProperty sp = new StringProperty(ctx.ID().getText());
            sp.setValue(s.substring(1, s.length() - 1));
            return sp;
        } else if (ctx.INT() != null) {
            IntProperty ip = new IntProperty(ctx.ID().getText());
            int value = Integer.valueOf(ctx.INT().getText());
            if (ctx.MINUS() != null){
                value = - value;
            }
            ip.setValue(value);
            return ip;
        }
        return new Property("<error>");
    }

    @Override
    public Note visitNote(MusicScriptParser.NoteContext ctx) {

        Alteration a = Alteration.NONE;
        if (ctx.alteration() != null) {
            if (ctx.alteration().MINUS() != null) {
                a = Alteration.FLAT;
            } else if (ctx.alteration().PLUS() != null) {
                a = Alteration.SHARP;
            } else if (ctx.alteration().EQUAL() != null) {
                a = Alteration.RESTORED;
            }
        }

        String note = ctx.NOTE().getText();
        char nc;
        boolean rest = false;
        switch (note) {
            case "do":
                nc = 'C';
                break;
            case "re":
                nc = 'D';
                break;
            case "mi":
                nc = 'E';
                break;
            case "fa":
                nc = 'F';
                break;
            case "sol":
                nc = 'G';
                break;
            case "la":
                nc = 'A';
                break;
            case "si":
                nc = 'B';
                break;
            case "R":
            case "r":
                rest = true;
                nc = 'R';
                break;
            default:
                nc = Character.toUpperCase(note.charAt(0));
        }
        // todo replace with default octave.
        int octave = 0;
        if (ctx.octave() != null) {
            int rel = Integer.parseInt(ctx.octave().INT().getText());
            if (ctx.octave().MINUS() != null) {
                octave = -rel;
            } else {
                octave = rel;
            }
        }
        // todo : replace with default duration.
        int type = 5;
        int halfs = 0;
        if (ctx.duration() != null) {
            String sdir = ctx.duration().INT().getText();
            int dotIndex = sdir.indexOf('.');
            if ( dotIndex > -1){
                type = Integer.parseInt(sdir.substring(0,dotIndex));
                halfs = sdir.length()-dotIndex;
            }else{
                type = Integer.parseInt(sdir);
            }
        }
        NoteType nt = getNoteType(type);

        return new Note(nc, octave, a, nt, halfs, rest);
    }

    private NoteType getNoteType(int type) {
        NoteType nt = NoteType.QUARTER;
        switch (type) {
            case 0:
                nt = NoteType.D128;
                break;
            case 1:
                nt = NoteType.D64;
                break;
            case 2:
                nt = NoteType.D32;
                break;
            case 3:
                nt = NoteType.SIXTEENTH;
                break;
            case 4:
                nt = NoteType.EIGHT;
                break;
            case 5:
                nt = NoteType.QUARTER;
                break;
            case 6:
                nt = NoteType.HALF;
                break;
            case 7:
                nt = NoteType.WHOLE;
                break;
            case 8:
                nt = NoteType.BREVE;
                break;
            case 9:
                nt = NoteType.LONG;
                break;
            case 10:
                nt = NoteType.MAXIMA;
                break;
        }
        return nt;
    }

    @Override
    public List<Note> visitNotegroup(NotegroupContext ctx) {
        List<Note> notes
                = ctx.note().stream().map(n -> visitNote(n)).collect(Collectors.toList());
        
        if ( ctx.duration() != null ){
            int type;
            int halfs = 0;
            String sdir = ctx.duration().INT().getText();
            int dotIndex = sdir.indexOf('.');
            if ( dotIndex > -1){
                type = Integer.parseInt(sdir.substring(0,dotIndex));
                halfs = sdir.length()-dotIndex;
            }else{
                type = Integer.parseInt(sdir);
            }
            
            int i = 0;
            int last = notes.size()-1;
            for ( Note n: notes){
                n.setNoteType(getNoteType(type));
                n.setHalfs(halfs);
                
                if ( i == 0 ){
                    n.startBeam();
                }else if ( i == last){
                    n.endBeam();
                }else{
                    n.continueBeam();
                }
                ++i;
            }
        }
        
        return notes;
    }
    
    

    @Override
    public String visitLyrics(MusicScriptParser.LyricsContext ctx) {
        return ctx.STRING().getText(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
