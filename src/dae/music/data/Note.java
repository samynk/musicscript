package dae.music.data;

import java.util.ArrayList;

/**
 *
 * @author Koen.Samyn
 */
public class Note {
    private final char step;
    private final int octave;
    private final Alteration alter;
    private NoteType type;
    private int halfs;
    private boolean rest = false;
    private Beam beam = Beam.NONE;
    
    private ArrayList<String> lyrics;
    
    public Note(char step, int octave, Alteration alter, NoteType type, int halfs){
        this(step,octave,alter,type, halfs,false);
    }
    
    public Note(char step, int octave, Alteration alter, NoteType type, int halfs,boolean isRest){
        this.step = step;
        this.octave = octave;
        this.alter = alter;
        this.type = type;
        this.halfs = halfs;
        this.rest = isRest;
    }

    /**
     * @return the step
     */
    public char getStep() {
        return step;
    }

    /**
     * @return the octave
     */
    public int getOctave() {
        return octave;
    }

    /**
     * @return the alter
     */
    public Alteration getAlter() {
        return alter;
    }

    /**
     * @return the type
     */
    public NoteType getType() {
        return type;
    }

    /**
     * @return the rest
     */
    public boolean isRest() {
        return rest;
    }

    public int getHalfs() {
        return halfs;
    }

    public void addLyric(String syllable) {
        if ( lyrics == null){
            lyrics = new ArrayList<String>();
        }
        lyrics.add(syllable);
    }
    
    public Iterable<String> getLyrics(){
        return lyrics;
    }

    public boolean hasLyrics() {
        return lyrics!=null && lyrics.size()>0;
    }

    public void setNoteType(NoteType noteType) {
        this.type = noteType;
    }

    public void setHalfs(int halfs) {
        this.halfs = halfs;
    }

    public void endBeam() {
        beam = Beam.END;
    }

    public void continueBeam() {
        beam = Beam.CONTINUE;
    }

    public void startBeam() {
        beam = Beam.START;
    }
    
    public Beam getBeam(){
        return beam;
    }
}
