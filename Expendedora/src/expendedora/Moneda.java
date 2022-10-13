package expendedora;

import java.util.ArrayList;

abstract class Moneda {
    
    public Moneda(){
        
    }
    public Moneda getSerie (){
        return this;
    }
    public abstract int getValor();
    
}
