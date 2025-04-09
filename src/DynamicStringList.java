public class DynamicStringList implements StringList {

    private String[] values;

    public DynamicStringList(String[] values)
    {
        values = this.values;
    }
    
    // Get
    public String get(int index)
    {
        try 
        {
            return "";
        } 
        catch (IndexOutOfBoundsException e) 
        {
            return "Please input a number within the size of the array. " + e;
        }
        
    }

    // Set
    public void set(int index, String value) {

    }
    
    // Add
    public void add (String value)
    {
        //
    }

    // Remove
    public String remove(int index) {
        return "";
    }

    // Size
    public int size()
    {
        return 0;
    }

    // Capacity
    public int capacity() {
        return 0;
    }
}
