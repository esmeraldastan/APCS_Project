
/**
 * Write a description of class Teddy here.
 * 
 * @author Esmeralda Lopez
 * @version 3.09.17
 */
public class Teddy extends Enemy{
    int damage;
    public Teddy(int dmg){
        super(400);
        damage = dmg;
    }
    public void attack(Enemy target){
        target.damageTaken(damage);
    }
    public void damageTaken(int dmg){
        System.out.println("Lets play!");
        System.out.println(hitpoints - damage);
        if (hitpoints - damage <= 0){
            System.out.println("I'll be back to play.");
        }
        super.damageTaken(dmg);
    }
 
}
