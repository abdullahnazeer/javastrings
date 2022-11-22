import com.sparta.Main;
import com.sparta.Summer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    @DisplayName("Given an array of {10, 21, 3, 14, 5}, result is 53")
    public void GivenArrayIntegers_Returns53() {
        // Arrange
        int[] myInts = {10, 21, 3, 14, 5};
        int expectedResult = 53;
        // Act
        Summer summer = new Summer();
        int result = summer.sumArray(myInts);
        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Given an array of {1, 21, 13, 14, 7}, result is 56")
    public void GivenArrayIntegers_Returns56() {
        // Arrange
        int[] myInts = {1, 21, 13, 14, 7};
        int expectedResult = 56;
        // Act
        Summer summer = new Summer();
        int result = summer.sumArray(myInts);
        // Assert
        assertEquals(expectedResult, result);
    }
}
