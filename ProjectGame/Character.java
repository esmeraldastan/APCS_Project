
/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Character{
    int hitpoints;
    String name;
    public Character(String name, int hp){
        hitpoints = hp;
        this.name = name;
    }
    public void damageTaken(int dmg){
        hitpoints -= dmg;
    }
    public String getName(){
        return name;   
     }
    public int getHp(){
        return hitpoints;   
     }
   }
