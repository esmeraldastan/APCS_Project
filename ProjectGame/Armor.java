
/**
 * Abstract class Armor - write a description of the class here
 * 
 * @author Esmeralda
 * @version 2.27.17
 */
import java.lang.Math;
public abstract class Armor extends Item implements DefenseCommands{
    int defence;
    public Armor(String name, int armor){
    super(name);
    defence = armor;
   }
   public boolean blocked(){
       double number = Math.random()* 100;//a random number
       if (defence > number){
           return true;
        }
        return false;
    }
   
    
    
   
}
