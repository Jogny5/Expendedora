package expendedora;

import java.util.ArrayList;

public class Comprador {
    private Moneda m;
    private int cualBebida;    
    private Expendedor exp;
    
    public Comprador(Moneda mon,int beb,Expendedor e){
        
        m=mon;
        cualBebida=beb;
        exp=e;
    }
    
    
    public int cuantoVuelto(){
        int x = m.getValor()-exp.getPrecioBebidas();
        return x;
        
    }
    
    public String queBebiste(){
        if(this.cualBebida==1){
            return new String ("cocacola");
        }else if(this.cualBebida==2){
            return new String ("sprite");
        }else if(this.cualBebida==3){
            return new String ("fanta");
        }else{
            return null;
        }
        
    }
    
}
