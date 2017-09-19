package dae.music.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Koen.Samyn
 */
public class Measure {

    private final ArrayList<Note> notes = new ArrayList<>();
    
    
    private boolean clefSet = false;
    private String clef;
    private char note;
    private int line;
    
    private boolean timeSet = false;
    private int beat;
    private int beatType;
    
    private Key key;
    private boolean keySet = false;
    
    public void addNote(Note note) {
        notes.add(note);
    }


    public void addNotes(List<Note> notes) {
        this.notes.addAll(notes);
    }

    public void setClef(String clef) {
        this.clef = clef;
        if (clef.length() >= 3) {
            note = clef.charAt(1);
            line = Integer.parseInt(clef.substring(2));
        }
        clefSet = true;
    }

    /**
     * @return the clef
     */
    public String getClef() {
        return clef;
    }

    /**
     * @return the clefSet
     */
    public boolean isClefSet() {
        return clefSet;
    }

    /**
     * @return the note
     */
    public char getClefNote() {
        return note;
    }

    /**
     * @return the line
     */
    public int getClefLine() {
        return line;
    }
    
    public void setTime(int beat, int beatType){
       timeSet = true;
       this.beat = beat;
       this.beatType = beatType;
    }
    
    public int getBeat(){
        return beat;
    }
    
    public int getBeatType(){
        return beatType;
    }
    
    public boolean isTimeSet(){
        return timeSet;
    }

    public Iterable<Note> getNotes() {
        return notes;
    }

    public void setKey(Key key) {
        keySet = true;
        this.key = key;
    }
    
    public Key getKey(){
        return key;
    }
    
    public boolean isKeySet(){
        return keySet;
    }

    public int getNumberOfNotes() {
        return notes.size();
    }

    public Note getNote(int i) {
        return notes.get(i);
    }

        
}
