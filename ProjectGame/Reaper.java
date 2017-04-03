
/**
 * Write a description of class Reaper here.
 * 
 * @author Esmeralda Lopez
 * @version 2.16.17
 */
public class Reaper extends Enemy{
   int damage = 500;
   /**
    * damage = 500
    */
   public Reaper(int dmg){
       super("Reaper",1000);//health
       damage = dmg;
    }
    //target
   public void takeDown(Enemy target){
        target.damageTaken(damage);
    }
   public void damageTaken(int dmg){
       //while (hitpoints >0){
       //method for later use
       
       System.out.println("RRRRrrrrrr");
       System.out.println(hitpoints-damage);   
       if (hitpoints-damage <= 0){
            System.out.println("Your soul will be mine!!!");
       }
       super.damageTaken(dmg);
     }
   }
