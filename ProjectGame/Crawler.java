
/**
 * Write a description of class Crawlers here.
 * 
 * @author Esmeralda
 * @version 3.09.17
 */
public class Crawler extends Enemy{
    int damage = 300;
    public Crawler(int dmg){
        super(800);//health
        damage = dmg;
    }
    public void attack(Enemy target){
        target.damageTaken(damage);
    }
    public void damageTaken(int dmg){
        System.out.println("You shall be my lunch!");
        System.out.println(hitpoints-damage);
        if(hitpoints - damage <= 0){
        System.out.println("You haven't seen the last of me");
        super.damageTaken(dmg);
      }
    }
   
}
