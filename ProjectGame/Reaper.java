
/**
 * Write a description of class Reaper here.
 * 
 * @author Esmeralda Lopez
 * @version 2.16.17
 */
public class Reaper extends Enemy{
   int damage;
   
   public Reaper(int hp, int dmg){
       super(hp);
       damage = dmg;
    }
   public void takeDown(Enemy target){
        target.damageTaken(damage);
    }
   public void damageTaken(int dmg){
       while (hitpoints >0){
           
        System.out.println("RRRRrrrrrr");
        System.out.println(hitpoints-damage);
        if (hitpoints <= 0){
            System.out.println("Great you won!");
        }
        super.damageTaken(dmg);
    }
   }
} 
/**
 * public void damageTaken(int damage){
        System.out.println("RRRRrrrrrr");
        System.out.println(hitpoints-damage);
        super.damageTaken(dmg);
    }
 */