
/**
 * Abstract class Armor - write a description of the class here
 * 
 * @author Esmeralda
 * @version 2.27.17
 */
public abstract class Armor extends Item implements DefenseCommands{
    int defence;
    public Armor(String name, int armor){
    super(name);
    defence = armor;
   }
   public int block(){
    }
   
    
    
   
}
