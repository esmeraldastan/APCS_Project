
/**
 * Write a description of class Sword here.
 * 
 * @author Esmeralda
 * @version 2.27.17
 */
public class Sword extends Weapons{
    int damage =100;
    int hp = 500;
    
    public Sword(){
       super("Sword", 500);
    }
    public void attack(int x){//int x){
        damage = x;
        //return hitpoints;
        
     }
   
}
