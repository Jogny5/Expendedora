package expendedora;

import java.util.ArrayList;

public class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    
    public Expendedor(int e){
        this.coca=new Deposito();
        this.sprite=new Deposito();
        
        for(int i=0;i<e;i=i+1){
            CocaCola c=new CocaCola(100+i);
            Sprite s=new Sprite(200+i);
            
            coca.addBebida(c);
            sprite.addBebida(s);
        }
        
        
    }
    
    public Bebida comprarBebida(Moneda m,int e){
        switch (e) {
            case 1:
                return this.coca.getBebida();
            case 2:
                return this.sprite.getBebida();
            default:
                return null;
        }
        
    }
}
