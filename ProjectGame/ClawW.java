
/**
 * Write a description of class ClawW here.
 * 
 * @author Esmeralda 
 * @version 2.27.17
 */
public class ClawW extends Weapons{
    int damage = 75;
    int hp = 100;
    public ClawW(){
        super("ClawW", 1500);
    }
    public void attack(int x){
        damage = x;
    }
 
}
