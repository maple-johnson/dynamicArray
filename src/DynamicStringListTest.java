import static org.junit.Assert.assertEquals;
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

    // ******************** Testing for Set ********************


    // ******************** Testing for Add ********************


    // ******************** Testing for Remove ********************


    // ******************** Testing for Size ********************


    // ******************** Testing for Capacity ********************
    
}
