
/**
 * Abstract class Enemy - write a description of the class here
 * 
 * @author Esmeralda Lopez
 * @version 2.15.17
 */
public abstract class Enemy{
    /**
     * Make at least 3 different type of enemies
     * 1. some type of creature
     * 2. person
     * 3. poison plant a long the way 
     */
    int hitpoints;
    String name; 
    public Enemy(String name, int hp){//hp of the Enemy
        this.name = name;
        hitpoints = hp;
    }
    public void damageTaken(int dmg){
        hitpoints -= dmg;
    }
    public int dmgDone(){
        return hitpoints; 
    } 
}
