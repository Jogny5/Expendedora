package expendedora;

public class CocaCola extends Bebida {
    
    public CocaCola(int x){
        
        super(x);
    }
    
    @Override
    public String beber(){
        
        return super.beber()+new String("cocacola");
    }
    
}
