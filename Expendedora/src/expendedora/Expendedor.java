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
    
    public Bebida comprarBebida(Moneda m, int cual){
        
        try{
            if(m == null){
                throw new PagoIncorrectoException("No tienes una moneda valida");
            }        
        }catch(PagoIncorrectoException e){
            System.out.println(e.getMessage());
        }
        
        if(m.getValor()<precioBebidas){
            
            try{
                if(m == null){
                    throw new PagoInsuficienteException("No tienes dinero suficiente");
                }        
            }catch(PagoInsuficienteException e){
                System.out.println(e.getMessage());
            }
        }
        
        if(cual ==1){
          
            if(coca.remove(0)==null){
                
            }
            
            else return coca.remove(0);
        }
        
        if(cual ==2){
            
        }
        
        if(cual ==3){
            
        }
        
        else{
           
            try{
                if(m == null){
                    throw new NoHayBebidaException("No hay bebida");
                }        
            }catch(NoHayBebidaException e){
                System.out.println(e.getMessage());
            }
        }
    
    
    }
        
        
        
    }
    
    public Moneda getVuelto(){
        
        
    }
    
    
    
    
    
}
