
/**
 * Write a description of class PoisonPlant here.
 * 
 * @author Esmeralda Lopez
 * @version 2.16.17
 */
public class PoisonPlant extends Enemy{
  int damage = 250;
  public PoisonPlant(int dmg){
    super("Poison Plant", 500);//health
    damage = dmg; 
  }
  //target
  public void strike(Character target){
      target.damageTaken(damage); 
     }
  // v2
  public void damageTaken(int dmg){
       //while(hitpoints>0){
       //method for later use
       
      System.out.println("Death is in the bloom!");
      System.out.println(hitpoints-damage);//current health after taking damage
      if (hitpoints == 0){
            System.out.println("I'm not a harmless flower");
            
      }
      super.damageTaken(dmg);
   }
  }
