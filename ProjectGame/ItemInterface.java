
/**
 * These are the required methods for all items.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface
{
    /**
     * This method gets the name of an item
     * 
     *
     * @return        The name of the item 
     */
    public String getName();
    public ArrayList getStats();
}
