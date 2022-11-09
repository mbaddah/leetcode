package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RunningSumsTest {
    @Test
    void runningSumsTest() {
        RunningSums rs = new RunningSums();
        int [] actualRunningSum = rs.runningSum(new int[] {1,2,3,4});
        int [] expectedRunningSum = new int[]{1,3,6,10};
        assertArrayEquals(actualRunningSum,expectedRunningSum);
    }

}
