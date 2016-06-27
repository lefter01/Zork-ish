
import java.util.ArrayList;

public class Inventory 
{
    static private ArrayList<String> userHasItemList = new ArrayList<String>();
    
    public void putItemInArrayList(String item)
    {
        userHasItemList.add(item);  
    }
    //print inventory's items
    public void showInventory()
    {
        System.out.println("You have these items:");
        for(int i=0;i<userHasItemList.size();i++)  
        {
            String item = userHasItemList.get(i);
            System.out.println("Item " + (i+1) + " : " + item);
        }

    }
    
    //check if item exists allready to inventory 
    public boolean isItemInInventory(String item)
    {
        for(int i = 0; i < userHasItemList.size(); i++)
        {
            if(userHasItemList.contains(item))
                return true;
        }
        // if we get here, the string was not found in the commands
        return false;
    }
}
