package expendedora;

import java.util.ArrayList;

public class Deposito {
    private ArrayList<Bebida> aa;
        
    public Deposito(){
        this.aa=new ArrayList <Bebida>();
    }
    public void addBebida(Bebida b){
        this.aa.add(b);
     
        
    }
    public Bebida getBebida(){
        if(this.aa.size()>0){
            
            Bebida n=this.aa.get(0);
            this.aa.remove(0);
            return n;
        }else{
            return null;
        }
        
    }
}
