
/**
 * Write a description of class CreatureOfNight here.
 * 
 * @author Esmeralda Lopez
 * @version 2.15.17
 */
public class CreatureOfNight extends Enemy{
    int damage;
    public CreatureOfNight(int hp, int dmg){
        super(hp);
        damage = dmg; 
    }
    public void damageTaken(int dmg){
        System.out.println("You are going nowhere!");
        System.out.println(hitpoints-damage);
        super.damageTaken(dmg);
    }
    public void target(Enemy target){
        target.damageTaken(damage);
    }
    
  
    
}
