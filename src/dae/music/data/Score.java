package dae.music.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * A score object contains the metadata and the various parts of the score.
 *
 * @author Koen.Samyn
 */
public class Score {

    private String id;
    private String title = "title";
    private String composer = "composer";
    private String lyricist = "lyricist";
    private int divisions= 24;

    private final ArrayList<Part> parts = new ArrayList<>();
    private final HashMap<String, Property> properties = new HashMap<>();

    public Score() {

    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Add a part to the score.
     *
     * @param part the part to add.
     */
    public void addPart(Part part) {
        parts.add(part);
    }

    /**
     * Remove a part from the score.
     *
     * @param part the part to remove.
     */
    public void removePart(Part part) {
        parts.remove(part);
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the composer
     */
    public String getComposer() {
        return composer;
    }

    /**
     * @param composer the composer to set
     */
    public void setComposer(String composer) {
        this.composer = composer;
    }

    /**
     * @return the lyricist
     */
    public String getLyricist() {
        return lyricist;
    }

    /**
     * @param lyricist the lyricist to set
     */
    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }
    
    /**
     * @return the divisions
     */
    public int getDivisions() {
        return divisions;
    }

    /**
     * @param divisions the divisions to set
     */
    public void setDivisions(int divisions) {
        this.divisions = divisions;
    }

    public void addParts(List<Part> parts) {
        this.parts.addAll(parts);
    }

    public void addProperties(List<Property> properties) {
        for (Property p : properties) {
            this.properties.put(p.getId(), p);
            switch (p.getId()) {
                case "title":
                    title = p.toString();
                    break;
                case "lyricist":
                    lyricist = p.toString();
                    break;
                case "divisions":
                    setDivisions(p.asInt());
                    break;
            }
        }
    }

    public Iterable<Part> getParts() {
        return parts;
    }

    public void equalizeMeasures() {
        int max = 0;
        for( Part p: this.parts){
            int ms = p.getNrOfMeasures();
            if (ms > max){
                max = ms;
            }
        }
        
        for( Part p: this.parts){
            p.appendNecessaryMeasures(max);
        }
    }

    
}
