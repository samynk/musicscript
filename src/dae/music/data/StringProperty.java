/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dae.music.data;

/**
 *
 * @author Koen.Samyn
 */
public class StringProperty extends Property {
    private String value;
    
    public StringProperty(String id){
        super(id);
        
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
    
    
}
