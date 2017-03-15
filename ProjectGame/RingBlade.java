
/**
 * Write a description of class RingBlade here.
 * 
 * @author Esmeralda Lopez
 * @version 2.28.17
 */
public class RingBlade extends Weapons{
    int damage = 75;
    int hp = 1500;
    public RingBlade(){
        super(" Ring Blade", 1700);
    }
    public void attack(int x){
        damage = x;
    }
    
}

