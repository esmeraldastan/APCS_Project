
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    // name and value of an item 
   String name;
   public Item(String name){
       this.name = name;
    }
   public String getName(){
       return name;
       
    }
        public ArrayList getStats(){
    ArrayList<Object> array = new ArrayList<Object>();
    array.add(name);
    return array;

   }
}
    
       

   //Implemented in your own way

