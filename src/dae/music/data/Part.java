package dae.music.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Koen.Samyn
 */
public class Part {
    private String id;
    private String name;
    private String shortName;
    private int octave;
    private int octaveChange;
    
    private final HashMap<String,Property> properties = new HashMap<>();
    private final ArrayList<Voice> voices = new ArrayList<>();
    
    public Part(){
        
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the shortName
     */
    public String getShortName() {
        return shortName;
    }
    
    public int getOctave()
    {
        return octave;
    }
    
    public int getOctaveChange(){
        return octaveChange;
    }
    
    /**
     * @param shortName the shortName to set
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void addProperties(List<Property> properties) {
         for(Property p: properties)
        {
            this.properties.put(p.getId(), p);
            switch(p.getId()){
                case "name": 
                    name = p.toString();
                    break;
                case "shortname":
                    shortName = p.toString();
                    break;
                case "octave":
                    octave = p.asInt();
                    break;
                case "octavechange":
                    octaveChange = p.asInt();
                    break;
            }
        }
    }

    public void addVoice(Voice v){
        voices.add(v);
    }
    
    public void addVoices(List<Voice> voices){
        this.voices.addAll(voices);
    }

    public Iterable<Voice> getVoices() {
        return voices;
    }

    int getNrOfMeasures() {
        int max = 0;
        for (Voice v: voices){
            int nrOfMeasures = v.getNrOfMeasures();
            if ( nrOfMeasures > max){
                max = nrOfMeasures;
            }
        }
        return max;
    }

    void appendNecessaryMeasures(int measures) {
        int max = 0;
        for (Voice v: voices){
            int nrOfMeasures = v.getNrOfMeasures();
            v.insertEmptyMeasures(measures - nrOfMeasures);
        }
    }
}
