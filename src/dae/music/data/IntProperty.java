package dae.music.data;

/**
 *
 * @author Koen.Samyn
 */
public class IntProperty extends Property {
    private int value;
    
    public IntProperty(String id){
        super(id);
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
}
