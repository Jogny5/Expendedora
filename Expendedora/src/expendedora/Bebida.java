package expendedora;

public abstract class Bebida {
    
    private final int serie;
    
    public Bebida(int n){
        this.serie=n;
    }
    
    public String beber(){
        return new String("sabor: ");
    }

    public int getSerie() {
        return serie;
    
    
}
