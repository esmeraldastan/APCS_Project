
/**
 * Write a description of class CreatureOfNight here.
 * 
 * @author Esmeralda Lopez
 * @version 2.15.17
 */
public class CreatureOfNight extends Enemy{
    int damage = 550;//damage
    /**
     * damage = 550
     */
    public CreatureOfNight(int dmg){
        super("Creature of the Night", 1500);//health
        damage = dmg; 
    }
    //target
        public void target(Enemy target){
        target.damageTaken(damage);
    }
    public void damageTaken(int dmg){
        //while added later on 
        System.out.println("You are going nowhere!");
        System.out.println(hitpoints-damage);
        if(hitpoints - damage <= 0){
            System.out.println("I will be back!");
            
        }
        super.damageTaken(dmg);
    }
}
