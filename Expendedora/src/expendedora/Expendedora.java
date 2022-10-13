package expendedora;

import java.util.ArrayList;

public class Expendedora {

    
    public static void main(String[] args) {
       Expendedor exp = new Expendedor(100,300);
        Moneda1000 m1k = new Moneda1000();
                
        Comprador com = new Comprador(m1k,1,exp);
        
                
        exp.comprarBebida(m1k,2);
        System.out.println(com.cuantoVuelto());
        
        System.out.println(exp.getVuelto());
        System.out.println(exp.getVuelto());
        System.out.println(exp.getVuelto());
        
        
       
        
    }
    
}
