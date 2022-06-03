package words;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BalancedWordsCounterTest {

    @Test
    void checkBalanced(){
//        I put(input1) different String than in example, cause word wouldn't be balanced
        String input1 = "aabbcbcccbaa";
        String input2 = "";
        String input3 = "abababa1";
        String input4 = "null";

        assertEquals(28, BalancedWordsCounter.count(input1));
        assertEquals(0, BalancedWordsCounter.count(input2));
        assertEquals(RuntimeException.class, BalancedWordsCounter.count(input3));
        assertEquals(RuntimeException.class, BalancedWordsCounter.count(input4));
    }
}
