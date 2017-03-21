
/**
 * Abstract class Armor - write a description of the class here
 * 
 * @author Esmeralda
 * @version 2.27.17
 */
import java.lang.Math;
public abstract class Armor extends Item implements DefenseCommands{
    int defense;
    public Armor(String name, int armor){
    super(name);
    defense = armor;
   }
   public boolean block(){
       double number = Math.random()* 100;//a random number
       if (defense > number){
           return true;
        }
        return false;
    }
   
    
    
   
}
