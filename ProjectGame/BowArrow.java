
/**
 * Write a description of class BowArrow here.
 * 
 * @author Esmeralda 
 * @version 2.27.17
 */
public class BowArrow extends Weapons{
    int damage = 300;
    int hp = 100;
    public BowArrow(){
        super("Bow Arrow", 1000);
    }
    public void attack(int x){
        damage = x;
        
   }
    }
  