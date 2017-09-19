package dae.music.data;

/**
 *
 * @author Koen.Samyn
 */
public enum NoteType {
    D1024(1,256,"1024th"),D512(1,128,"512th"),D256(1,64,"256th"),D128(1,32,"128th"),
    D64(1,16,"64th"),D32(1,8,"32th"),SIXTEENTH(1,4,"16th"),EIGHT(1,2,"eighth"),
    QUARTER(1,1,"quarter"),
    HALF(2,1,"half"),WHOLE(4,1,"whole"),BREVE(8,1,"breve"),LONG(16,1,"long"),MAXIMA(32,1,"maxima");
    private final int numerator;
    private final int denominator;
    private final String label;
    
    NoteType(int numerator,int denominator,String label){
        this.numerator = numerator;
        this.denominator = denominator;
        this.label = label;
    }
    
    public int convertDuration(int duration){
        return (duration*numerator)/denominator;
    }

    public String label() {
        return label;
    }
    
}
