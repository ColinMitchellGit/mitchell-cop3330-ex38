package ex38;

import org.junit.jupiter.api.Test;

import static ex38.App.filterEvenNumbers;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    @Test
    void testFilter() {

        int[] expectedOutput = {2,4,6,8};

        int[] to_be_tested = {1,2,3,4,5,6,7,8};

        assertArrayEquals(expectedOutput, filterEvenNumbers(to_be_tested));
    }
}
