
/**
 * Write a description of class Axe here.
 * 
 * @author Esmeralda Lopez
 * @version 2.23.17
 */
public class Axe extends Weapons{
    int damage = 1000;
    int hp = 1500;
    public Axe(){
        super("Axe", 1500);
    }
    
    public void attack(int x){
        damage = x;
    }
        
    
   
}
