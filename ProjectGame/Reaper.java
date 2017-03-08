
/**
 * Write a description of class Reaper here.
 * 
 * @author Esmeralda Lopez
 * @version 2.16.17
 */
public class Reaper extends Enemy{
   int damage = 500;
   
   public Reaper(int dmg){//int hp, int dmg
       super(1000); 
       damage = dmg;
    }
    //target
   public void takeDown(Enemy target){
        target.damageTaken(damage);
    }
   public void damageTaken(int dmg){
       //while (hitpoints >0){
       System.out.println("RRRRrrrrrr");
       System.out.println(hitpoints-damage);   
   
       if (hitpoints-damage <= 0){
            System.out.println("Great you won!");
       }
       super.damageTaken(dmg);
     }
   }
