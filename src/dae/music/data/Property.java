package dae.music.data;

/**
 *
 * @author Koen.Samyn
 */
public class Property {
    private String id;
    
    public Property(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public int asInt(){
        if (this instanceof IntProperty){
            IntProperty ip = (IntProperty)this;
            return ip.getValue();
        }
        return -1;
    }
}
