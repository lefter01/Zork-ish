
public class ItemWords 
{
    //a constant array that holds all valid second word/item words
    private static final String validItem[] = {
        "torch", "knife","key","phone"
    };
    
    /**
     * Constructor - initialise the command words.
     */
    public ItemWords()
    {
        // nothing to do at the moment...
    }
    
    /**
     * Check whether a given String is a valid item word. 
     * Return true if it is, false if it isn't.
     **/
    public boolean isItem(String aString)
    {
        for(int i = 0; i < validItem.length; i++)
        {
            if(validItem[i].equals(aString))
                return true;
        }
        // if we get here, the string was not found in the commands
        return false;
    }

}
