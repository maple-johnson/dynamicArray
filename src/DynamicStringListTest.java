import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class DynamicStringListTest 
{

    // ******************** Testing for Get ********************
    @Test
    void testGet_availableIndex()
    {
        // Arrange
        String[] inputArray = {"Bulbasaur", "Ivysaur", "Venusaur"};
        DynamicStringList arr = new DynamicStringList(inputArray);
        int input = 1;
        // Act
        String actual = arr.get(input);
        // Assert
        assertEquals("Ivysaur", actual);
    }

    // @Test
    // void testGet_outOfBounds()
    // {
    //     // Arrange
    //     String[] inputArray = {"Sora", "Donald", "Goofy"};
    //     DynamicStringList arr = new DynamicStringList(inputArray);
    //     int input = 9;
    //     // Act
    //     String actual = arr.get(input);
    //     //Assert
    //     assertThrows(IndexOutOfBoundsException, actual);
    // }

    @Test
    void testGet_nullValue()
    {
        // Arrange
        String[] inputArray  = {"Sora", "Donald", "Goofy", null};
        DynamicStringList arr = new DynamicStringList(inputArray);
        int input = 3;
        // Act
        String actual = arr.get(input);
        // Assert
        assertEquals(null, actual);
    }

    // ******************** Testing for Set ********************


    // ******************** Testing for Add ********************


    // ******************** Testing for Remove ********************


    // ******************** Testing for Size ********************


    // ******************** Testing for Capacity ********************
    
}
