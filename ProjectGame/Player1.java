
/**
 * Write a description of class Player1 here.
 * 
 * @author Esmeralda Lopez
 * @version 3.06.17
 */
import java.util.Scanner;
public class Player1 extends Character{
    int damage = 50;
    public Player1(){
        super("ChaseRekz", 1000);
        System.out.println("Player: " + this.getName());
        System.out.println("HP: " + this.getHp());
        System.out.println("Basic damage: "+ damage);
        System.out.println();
        System.out.println();
    }
    public void attack(Enemy target){
        //Scanner input = new Scanner(System.in);
        target.damageTaken(damage);
        
    }
    public String getResponse(String command)
        String response = "";
        
        
    public void damageDone(int dmg){
        System.out.println("Attack or close?");
        String command = input
        Scanner input = new Scanner(System.in);
        if(this.getHp() == 0){
            System.out.println("Head back");
        }
    }
}
   
        
        
       
        
        
   

