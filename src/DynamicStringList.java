public class DynamicStringList implements StringList {

    private String[] arr;

    public DynamicStringList(String[] arr)
    {
        arr = this.arr;
    }
    
    // Get
    public String get(int index)
    {
        try 
        {
            return arr[index];
        } 
        catch (IndexOutOfBoundsException e) 
        {
            return "Please input a number within the size of the array. " + e;
        }
        
    }

    // Set
    public void set(int index, String value) {
        try {
            arr[index] = value;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
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
