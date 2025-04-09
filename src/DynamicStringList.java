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

    }
    
    // Add
    public void add (String value)
    {
        if (arr[arr.length] == null) // If array not full
        {
            // Find the first empty location, and add the value
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] == null)
                {
                    arr[i] = value;
                }
            }
        }
        else // if array full
        {
            // Create a new array
            String[] tempArr = new String[arr.length * 2];

            // Add all of the arr values into the temp array
            for (int i = 0; i < arr.length; i++) 
            {
                tempArr[i] = arr[i];
            }

            // Add the new value
            tempArr[arr.length] = value;

            // Create new version of arr
            arr =  new String[tempArr.length];

            // Add all values in the temp array to the array
            for (int i = 0; i < tempArr.length; i++) 
            {
                arr[i] = tempArr[i];
            }

        }
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
