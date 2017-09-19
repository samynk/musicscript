package dae.io;

import dae.music.data.Score;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static dae.io.XMLUtils.*;
import dae.music.data.Beam;
import dae.music.data.Key;
import dae.music.data.Measure;
import dae.music.data.Note;
import dae.music.data.NoteType;
import dae.music.data.Part;
import dae.music.data.Voice;

/**
 *
 * @author Koen.Samyn
 */
public class MusicXMLWriter {

    public static void writeMusicXML(Score s, File file) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            writeHeader(bw);
            writeWork(bw, s);
            writeParts(bw, s);
            writeFooter(bw);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(MusicXMLWriter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void writeHeader(BufferedWriter bw) throws IOException {
        bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<!DOCTYPE score-partwise PUBLIC \"-//Recordare//DTD MusicXML 3.0 Partwise//EN\" \"http://www.musicxml.org/dtds/partwise.dtd\">\n"
                + "<score-partwise>\n");

    }

    private static void writeWork(BufferedWriter bw, Score s) throws IOException {
        writeTabs(bw, 1);
        bw.write("<work>\n");
        writeTabs(bw, 2);
        bw.write("<work-title>");
        bw.write(s.getTitle());
        bw.write("</work-title>\n");
        writeTabs(bw, 1);
        bw.write("</work>\n");
    }

    private static void writeFooter(BufferedWriter bw) throws IOException {
        bw.write("</score-partwise>\n");
    }

    private static void writeParts(BufferedWriter bw, Score s) throws IOException {
        writeTabs(bw, 1);
        bw.write("<part-list>\n");
        for (Part p : s.getParts()) {
            writeTabs(bw, 2);
            bw.write("<score-part ");
            writeAttribute(bw, "id", p.getId());
            bw.write(">\n");

            writeTabs(bw, 3);
            bw.write("<part-name>");
            bw.write(p.getName());
            bw.write("</part-name>\n");

            writeTabs(bw, 3);
            bw.write("<part-abbreviation>");
            bw.write(p.getShortName());
            bw.write("</part-abbreviation>\n");

            writeTabs(bw, 2);
            bw.write("</score-part>\n");

        }
        writeTabs(bw, 1);
        bw.write("</part-list>\n");

        for (Part p : s.getParts()) {
            writePart(bw, p, s.getDivisions());
        }
    }

    private static void writePart(BufferedWriter bw, Part p, int divisions) throws IOException {
        writeTabs(bw, 1);
        bw.write("<part ");
        writeAttribute(bw, "id", p.getId());
        bw.write(">\n");

        for (Voice v : p.getVoices()) {
            int number = 1;
            Key currentKey = new Key(null, null, "");
            for (Measure m : v.getMeasures()) {
                currentKey.reset();
                
                writeTabs(bw, 2);
                bw.write("<measure ");
                writeAttribute(bw, "number", number);
                bw.write(">\n");

                writeTabs(bw, 3);
                bw.write("<attributes>\n");
                writeTabs(bw, 4);
                bw.write("<divisions>");
                bw.write("" + divisions);
                bw.write("</divisions>\n");

                if (m.isKeySet()) {
                    writeTabs(bw, 4);
                    bw.write("<key>\n");
                    writeTabs(bw, 5);
                    currentKey = m.getKey();
                    currentKey.reset();
                    bw.write(currentKey.toXML());
                    bw.write("\n");
                    writeTabs(bw, 4);
                    bw.write("</key>\n");

                }
                if (m.isTimeSet()) {
                    writeTabs(bw, 4);
                    bw.write("<time>\n");
                    writeTabs(bw, 5);
                    bw.write("<beats>");
                    bw.write("" + m.getBeat());
                    bw.write("</beats>\n");
                    writeTabs(bw, 5);
                    bw.write("<beat-type>");
                    bw.write("" + m.getBeatType());
                    bw.write("</beat-type>\n");
                    writeTabs(bw, 4);
                    bw.write("</time>\n");
                }

                if (m.isClefSet()) {
                    writeTabs(bw, 4);
                    bw.write("<clef>\n");
                    writeTabs(bw, 5);
                    bw.write("<sign>");
                    bw.write(m.getClefNote());
                    bw.write("</sign>\n");
                    writeTabs(bw, 5);
                    bw.write("<line>");
                    bw.write("" + m.getClefLine());
                    bw.write("</line>\n");
                    
                    if ( p.getOctaveChange() != 0){
                        writeTabs(bw,5);
                        bw.write("<clef-octave-change>");
                        bw.write(Integer.toString(p.getOctaveChange()));
                        bw.write("</clef-octave-change>\n");
                    }
                    writeTabs(bw, 4);
                    bw.write("</clef>\n");
                }

                writeTabs(bw, 3);
                bw.write("</attributes>\n");

                for (Note n : m.getNotes()) {
                    writeTabs(bw, 3);
                    bw.write("<note>\n");
                    if (n.isRest()) {
                        writeTabs(bw, 4);
                        bw.write("<rest/>\n");
                    } else {
                        writeTabs(bw, 4);
                        bw.write("<pitch>\n");
                        writeTabs(bw, 5);
                        bw.write("<step>");
                        bw.write(n.getStep());
                        bw.write("</step>\n");
                        
                        switch(n.getAlter()){
                            case RESTORED: currentKey.restore(n.getStep());break;
                            case FLAT: currentKey.addFlat(n.getStep());break;
                            case SHARP:currentKey.addSharp(n.getStep());break;
                        }

                        if (currentKey.isFlat(n.getStep())) {
                            writeTabs(bw, 5);
                            bw.write("<alter>-1</alter>\n");
                        } else if (currentKey.isSharp(n.getStep())) {
                            writeTabs(bw, 5);
                            bw.write("<alter>+1</alter>\n");
                        }

                        writeTabs(bw, 5);
                        bw.write("<octave>");
                        bw.write("" + (p.getOctave() + n.getOctave()));
                        bw.write("</octave>\n");
                        writeTabs(bw, 4);
                        bw.write("</pitch>\n");
                    }

                    NoteType noteType = n.getType();
                    // divisions is number of ticks for a quarter note.

                    writeTabs(bw, 4);
                    int halfs = n.getHalfs();
                    int duration = noteType.convertDuration(divisions);
                    int sum = duration;
                    for (int i = 0; i < halfs; ++i) {
                        duration /= 2;
                        sum += duration;
                    }
                    bw.write("<duration>" + sum + "</duration>\n");
                    writeTabs(bw, 4);
                    bw.write("<voice>" + v.getId() + "</voice>\n");

                    writeTabs(bw, 4);
                    bw.write("<type>" + noteType.label() + "</type>\n");
                    for (int i = 0; i < halfs; ++i) {
                        writeTabs(bw, 4);
                        bw.write("<dot/>\n");
                    }
                    
                    switch(n.getBeam()){
                        case START: writeStartBeam(bw, 4, n.getBeam(),n.getType());break;
                        case CONTINUE:writeContinueBeam(bw,4, n.getBeam(),n.getType());break;
                        case END:writeEndBeam(bw,4, n.getBeam(),n.getType());break;
                    }

                    if ( n.hasLyrics() && !n.isRest())
                    {
                        int lyricNumber = 1;
                        for(String s: n.getLyrics())
                        {
                            writeTabs(bw,4);
                            bw.write("<lyric ");
                            writeAttribute(bw, "number", lyricNumber);
                            bw.write(">\n");
                            
                            writeTabs(bw,5);
                            bw.write("<syllabic>single</syllabic>\n");
                            
                            writeTabs(bw,5);
                            bw.write("<text>");
                            bw.write(s);
                            bw.write("</text>\n");
                            
                            writeTabs(bw,4);
                            bw.write("</lyric>\n");
                        }
                        
                    }
                    
                    
                    
                    writeTabs(bw, 3);
                    bw.write("</note>\n");
                }

                writeTabs(bw, 2);
                bw.write("</measure>\n");
                number++;
            }
        }

        writeTabs(bw, 1);
        bw.write("</part>\n");

    }

    private static void writeStartBeam(BufferedWriter bw, int tabs, Beam beam, NoteType type) throws IOException {
        writeTabs(bw,tabs);
        switch(type){
            case D32: bw.write("<beam number='3'>begin</beam>");
            case SIXTEENTH:bw.write("<beam number='2'>begin</beam>");
            case EIGHT:bw.write("<beam number='1'>begin</beam>");
        }
        bw.write("\n");
       
    }

    private static void writeContinueBeam(BufferedWriter bw, int tabs, Beam beam, NoteType type) throws IOException {
        writeTabs(bw,tabs);
        switch(type){
            case D32: bw.write("<beam number='3'>continue</beam>");
            case SIXTEENTH:bw.write("<beam number='2'>continue</beam>");
            case EIGHT:bw.write("<beam number='1'>continue</beam>");
        }
        bw.write("\n");
    }

    private static void writeEndBeam(BufferedWriter bw, int tabs, Beam beam, NoteType type) throws IOException {
        writeTabs(bw,tabs);
        switch(type){
            case D32: bw.write("<beam number='3'>end</beam>");
            case SIXTEENTH:bw.write("<beam number='2'>end</beam>");
            case EIGHT:bw.write("<beam number='1'>end</beam>");
        }
        bw.write("\n");
    }
}
