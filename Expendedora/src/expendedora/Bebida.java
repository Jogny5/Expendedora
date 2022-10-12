package expendedora;

public abstract class Bebida {
  
    private final int numSerie;
    
    public Bebida(int x){
        
        numSerie=x;
    }
    
    public int getSerie(){
        
        return numSerie;
    }
    
    public abstract String beber();
    
}
