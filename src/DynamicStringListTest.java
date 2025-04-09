import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    void testSet_SetStart() {
        //Arrange
        String[] staticArr = {"Yellow", "Red", "Blue", "Purple", "Orange", "Green"};
        DynamicStringList dynamicArr = new DynamicStringList(staticArr);
        //Act
        dynamicArr.set(0, "Brown");
        //Assert
        assertEquals("Brown", dynamicArr.get(0));
    }

    @Test
    void testSet_SetMiddle() {
        //Arrange
        String[] staticArr = {"Yellow", "Red", "Blue", "Purple", "Orange", "Green", "Cyan"};
        DynamicStringList dynamicArr = new DynamicStringList(staticArr);
        //Act
        dynamicArr.set(3, "Lime");
        //Assert
        assertEquals("Lime", dynamicArr.get(3));
    }

    @Test
    void testSet_SetEnd() {
        //Arrange
        String[] staticArr = {"Yellow", "Red", "Blue", "Purple", "Orange", "Green", "Cyan", "Red"};
        DynamicStringList dynamicArr = new DynamicStringList(staticArr);
        //Act
        dynamicArr.set(7, "Maroon");
        //Assert
        assertEquals("Maroon", dynamicArr.get(7));
    }

    // ******************** Testing for Add ********************


    // ******************** Testing for Remove ********************


    // ******************** Testing for Size ********************


    // ******************** Testing for Capacity ********************
    
}
