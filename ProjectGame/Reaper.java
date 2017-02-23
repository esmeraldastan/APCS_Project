
/**
 * Write a description of class Reaper here.
 * 
 * @author Esmeralda Lopez
 * @version 2.16.17
 */
public class Reaper extends Enemy{
   int damage = 500;
   int hp = 1000;
   public Reaper(int hp, int dmg){
       super(hp);
       damage = dmg;
    }
   public void takeDown(Enemy target){
        target.damageTaken(damage);
    }
   public void damageTaken(int damage){
        System.out.println("RRRRrrrrrr");
        System.out.println(hitpoints-damage);
        super.damageTaken(dmg);
    }
}
