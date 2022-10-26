package expendedora;

public class Sprite extends Bebida {
    
    public Sprite(int x){
        super(x);
    }
    
    @Override
    public String beber(){
        return super.beber()+new String("sprite");
    }

}
