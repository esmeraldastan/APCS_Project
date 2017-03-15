
/**
 * Write a description of class KBlade here.
 * 
 * @author Esmeralda Lopez
 * @version 2.28.17
 */
public class KBlade extends Weapons{
    int damage = 50;
    int hp = 100;
    public KBlade(){
        super("KBlade", 50)
    }
    public void attack(int x){
       damage = x;
    }
   
}
