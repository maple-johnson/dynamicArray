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

    @Test
    void testGet_emptyArray()
    {
        // Arrange
        String[] inputArray = new String[10];
        DynamicStringList arr = new DynamicStringList(inputArray);
        int input = 0;
        // Act
        String actual = arr.get(input);
        // Assert
        assertEquals(null, actual);
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
    @Test
    void testAdd_availableSpace()
    {
        // Arrange
        String[] inputArray = {"Clair", "Jill", "Rebecca", null, null};
        DynamicStringList arr = new DynamicStringList(inputArray);
        // Act
        arr.add("Sheva");
        String actual = arr.get(3);
        // Assert
        assertEquals("Sheva", actual);
    }

    @Test
    void testAdd_unavailableSpace()
    {
        // Arrange
        String[] inputArray = {"Strabby", "Bunger", "Kweeble"};
        DynamicStringList arr = new DynamicStringList(inputArray);
        // Act
        arr.add("Cinnasnail");
        String actual = arr.get(3);
        // Assert
        assertEquals("Cinnasnail", actual);
    }


    // ******************** Testing for Remove ********************
    @Test
    void testRemove_removeStart() {
        //Arrange
        String[] staticArr = {"Shadow Milk", "Dark Cacao", "Agar Agar", "Pancake", "Affogato", "Black Sapphire"};
        DynamicStringList dynamicArr = new DynamicStringList(staticArr);
        //Act
        dynamicArr.remove(0);
        //Assert
        assertEquals("Dark Cacao", dynamicArr.get(0));
    }

    @Test
    void testRemove_removeMiddle() {
        //Arrange
        String[] staticArr = {"Shadow Milk", "Dark Cacao", "Agar Agar", "Pancake", "Affogato", "Black Sapphire"};
        DynamicStringList dynamicArr = new DynamicStringList(staticArr);
        //Act
        dynamicArr.remove(3);
        //Assert
        assertEquals("Affogato", dynamicArr.get(3));
    }

    @Test
    void testRemove_removeEnd() {
        //Arrange
        String[] staticArr = {"Shadow Milk", "Dark Cacao", "Agar Agar", "Pancake", "Affogato", "Black Sapphire"};
        DynamicStringList dynamicArr = new DynamicStringList(staticArr);
        //Act
        dynamicArr.remove(5);
        //Assert
        assertEquals(null, dynamicArr.get(5));
    }


    // ******************** Testing for Size ********************
    @Test
    void testSize_nullArray()
    {
        // Arrange
        String[] inputArray = new String[10];
        DynamicStringList arr = new DynamicStringList(inputArray);
        // Act
        int actual = arr.size();
        // Assert
        assertEquals(0, actual);
    }

    @Test
    void testSize_partialNullArray()
    {
        // Arrange
        String[] inputArr = {"Bluey", "Bingo", "Muffin", null, null};
        DynamicStringList arr = new DynamicStringList(inputArr);
        // Act
        int actual = arr.size();
        // Assert
        assertEquals(3, actual);
    }

    @Test
    void testSize_fullArray()
    {
        // Arrange
        String[] inputArr = {"Captain Marvel", "She Hulk", "Squirrel Girl"};
        DynamicStringList arr = new DynamicStringList(inputArr);
        // Act
        int actual = arr.size();
        // Assert
        assertEquals(3, actual);
    }


    // ******************** Testing for Capacity ********************
    @Test
    void testCapacity_nullArray() {
        //Arrange
        String[] staticArr = new String[10];
        DynamicStringList dynamicArr = new DynamicStringList(staticArr);
        //Act
        int actual = dynamicArr.capacity();
        //Assert
        assertEquals(10, actual);
    }

    @Test
    void testCapacity_partialNullArray() {
        //Arrange
        String[] staticArr = new String[6];
        staticArr[0] = "Yugi";
        staticArr[1] = "Jonouchi";
        staticArr[2] = "Anzu";
        DynamicStringList dynamicArr = new DynamicStringList(staticArr);
        //Act
        int actual = dynamicArr.capacity();
        //Assert
        assertEquals(6, actual);
    }

    @Test
    void testCapacity_fullArray() {
        //Arrange
        String[] staticArr = new String[5];
        staticArr[0] = "Yugi";
        staticArr[1] = "Jonouchi";
        staticArr[2] = "Anzu";
        staticArr[3] = "Honda";
        staticArr[4] = "Seto";
        DynamicStringList dynamicArr = new DynamicStringList(staticArr);
        //Act
        int actual = dynamicArr.capacity();
        //Assert
        assertEquals(5, actual);
    }
}
