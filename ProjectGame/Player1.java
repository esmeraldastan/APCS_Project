
/**
 * Write a description of class Player1 here.
 * 
 * @author Esmeralda Lopez
 * @version 3.06.17
 */
import java.util.Scanner;
public class Player1{
    String name = "ChaseRekz";
    int hp = 1000;
    int damage = 50;
    public Player1(){
        System.out.println("Player: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Basic damage: "+ damage);
        System.out.println();
        System.out.println();
    }
    public void attack(Enemy target){
        //Scanner input = new Scanner(System.in);
        target.damageTaken(damage);
        
    }
    public void damageDone(int dmg){
        System.out.println("Attack or close?");
        Scanner input = new Scanner(System.in);
        if(hp == 0){
            System.out.println("Head back");
        }
    }
}
    //public
  
        
        
       
        
        
   

