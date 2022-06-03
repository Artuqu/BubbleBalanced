package bubble;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

class BubbleSortTest {

    @Test()
    void sort() {
        List<String> input = Arrays.asList("1", "4", "5", "6", "8", "3", "8");
        List<String> input2 = Arrays.asList("-9.3", "0.2", "4", "0.1", "5", "9");
        List<String> input3 = Arrays.asList("");
        List<String> input4 = Arrays.asList("null", "5.0001");
        String result = "[1,3,4,5,6,8,8]";
        String result2 = "[-9.3,0.1,0.2,4,5,9]";
        String result3 = "[]";
        String result4 = "[5.0001]";
        assertEquals(result, BubbleSort.sort(input));
        assertEquals(result2, BubbleSort.sort(input2));
        assertEquals(result3, BubbleSort.sort(input3));
        assertEquals(result4, BubbleSort.sort(input4));
    }

    @Test
    void testException() {
        List<String> input5 = Arrays.asList("null");
        assertEquals(RuntimeException.class, BubbleSort.sort(input5));
    }

    @Test
    void main() {

    }
}