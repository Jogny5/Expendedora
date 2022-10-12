package expendedora;

import java.util.ArrayList;

public class Expendedora {

    
    public static void main(String[] args) {
        Moneda mm=new Moneda();
       
        Expendedor ex=new Expendedor(5);
      
        Bebida f=ex.comprarBebida(mm,2);
        System.out.println(f.getSerie()+f.beber());
        
    }
    
}
