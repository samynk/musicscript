
package dae.music.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Koen.Samyn
 */
public class Key {
    private final ArrayList<Character> flats =new ArrayList<>();
    private final ArrayList<Character> sharps = new ArrayList<>();
    
    private final ArrayList<Character> flatsTemp =new ArrayList<>();
    private final ArrayList<Character> sharpsTemp = new ArrayList<>();
    
    private static final List<Character> FIFTHS_FLATS = Arrays.asList('B','E','A','D','G','C','F');
    private static final List<Character> FIFTHS_SHARPS = Arrays.asList('F','C','G','D','A','E','B');
    
    private String xmlString;
    
    public Key(List<Character> flats, List<Character> sharps, String xml){
        if ( flats != null){
            this.flats.addAll(flats);
        }
        if ( sharps != null ){
            this.sharps.addAll(sharps);
        }
        xmlString = xml;
    }
    
    public static Key createFifths(int fifths){
        String xml = "<fifths>"+fifths+"</fifths>";
        if ( fifths > 0 ){
            return new Key(null, FIFTHS_SHARPS.subList(0, fifths), xml);
        }else{
            return new Key(FIFTHS_FLATS.subList(0,-fifths),null,xml);
        }
    }
    
    public void reset(){
        sharpsTemp.clear();
        flatsTemp.clear();
        
        sharpsTemp.addAll(sharps);
        flatsTemp.addAll(flats);
    }
    
    public void addSharp(char key){
        sharpsTemp.add(key);
    }
    
    public void removeSharp(Character key){
        sharpsTemp.remove(key);
    }
    
    public void addFlat(char key){
        flatsTemp.add(key);
    }
    
    public void removeFlat(Character key){
        flatsTemp.remove(key);
    }
    
    public void restore(Character key){
        flatsTemp.remove(key);
        sharpsTemp.remove(key);
    }
    
    public boolean isSharp(char key){
        return sharpsTemp.contains(key);
    }
    
    public boolean isFlat(char key){
        return flatsTemp.contains(key);
    }
    
    public String toXML(){
        return xmlString;
    }
}
