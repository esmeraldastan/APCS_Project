
/**
 * Write a description of class Dagger here.
 * 
 * @author Esmeralda 
 * @version 2.27.17
 */
public class Dagger extends Weapons{
    int damage = 50;
    int hp = 100;
    public Dagger(){
        super("Dagger",100);
    }
    public void attack(int x){
        damage = x;
    }
    
}
