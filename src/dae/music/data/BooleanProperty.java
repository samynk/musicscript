package dae.music.data;

/**
 *
 * @author Koen.Samyn
 */
public class BooleanProperty extends Property{
    private boolean value;
    public BooleanProperty(String id){
        super(id);
    }

    /**
     * @return the value
     */
    public boolean isValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(boolean value) {
        this.value = value;
    }
    
    
}
