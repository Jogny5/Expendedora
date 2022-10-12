package expendedora;
import java.util.ArrayList;

public class Expendedor {
    
    private int numBebidas;
    private int precioBebidas;
    
    private ArrayList coca;
    private ArrayList sprite;
    private ArrayList fanta;
    
    public Expendedor(int num, int precio){
        
        numBebidas=num;
        precioBebidas=precio;
        
        coca = new ArrayList<CocaCola>();
        sprite = new ArrayList<Sprite>();
        fanta = new ArrayList<Fanta>();
        
        for(int i=1;i<numBebidas+1;i++){
            
            CocaCola c = new CocaCola(i);
            Sprite s = new Sprite(2*i);
            Fanta f = new Fanta(3*i);
            
            coca.add(c);
            sprite.add(s);
            fanta.add(f);
            
        }
    }
    
    
    
    
    
}
