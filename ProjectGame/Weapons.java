
/**
 * Write a description of class Axe here.
 * 
 * @author Esmeralda Lopez
 * @version 2.22.17
 */
import java.util.ArrayList;
import java.lang.Math;
public abstract class Weapons extends Item implements WeaponInterface{
    int hitpoints;
    public Weapons(String name, int hp){
        super(name);
        hitpoints = hp;
      
       
    }
    public int attack(){
        return hitpoints;
    }
    public boolean parry(){
        double num = Math.random()*100;
        if (num >= 50){
            return true;
        }
        return false;
    }
    public ArrayList getStats(){
    ArrayList<Object> array = new ArrayList<Object>();
    for (Object i : super.getStats()){
        array.add(i);
    }
    array.add(hitpoints);
    return array;
    }
}
      
     
