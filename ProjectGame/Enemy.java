
/**
 * Abstract class Enemy - write a description of the class here
 * 
 * @author Esmeralda Lopez
 * @version 2.15.17
 */
public abstract class Enemy extends Character{
    /**
     * Make at least 3 different type of enemies
     * 1. some type of creature
     * 2. person
     * 3. poison plant a long the way 
     */
    public Enemy(String name, int hp){//hp of the Enemy
        super(name, hp);        
    }
    
    public int dmgDone(){
        return hitpoints; 
    } 
}
