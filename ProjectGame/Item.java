
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    // name and value of an item 
    public String name;
    public int value;
    
    public Item(Item i){
        this.name = i.name;
        this.value = i.value;
    }
    
    //Implemented in your own way

}
