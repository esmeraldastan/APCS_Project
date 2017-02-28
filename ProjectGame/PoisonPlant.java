
/**
 * Write a description of class PoisonPlant here.
 * 
 * @author Esmeralda Lopez
 * @version 2.16.17
 */
public class PoisonPlant extends Enemy{
    int damage;
    int hp;
    //int hp;// hp of 500
   // int dmg;// dmg of 150
  public PoisonPlant(int hp, int dmg){
    super(hp); // hp being called form super class Enemy
    damage = dmg; 
    
  }
  /**
  * 
   public void damageTaken(int dmg){
      
      //might print 
      while ( hp > 0){
          System.out.println("Down you go!");
          super.damageTaken(dmg);// being called form super class 
          if (hp == 0){
              System.out.println("you have won");//very basic done first 
        }
    }
  }
  */
  public void strike( Enemy target){
      target.damageTaken(damage); 
     }
  // v2
  public void damageTaken(int dmg){
        System.out.println("Down you go!");
       System.out.println(hitpoints-damage);//current health after taking damage
       super.damageTaken(dmg);// being called form super class 
  }
}