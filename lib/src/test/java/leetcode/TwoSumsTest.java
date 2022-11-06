package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TwoSumsTest {
    @Test
    void twoSumTestValid01() {
        int[] arr = {2,7,11,15};
        int target = 9;
        TwoSums twoSums = new TwoSums();
        twoSums.twoSum(arr,target);
        assertNotNull( twoSums.twoSum(arr,target),"Target " + target + " not found" );

    }

    @Test
    void twoSumTestValid02() {
        int[] arr = {3,2,4};
        int target = 6;
        TwoSums twoSums = new TwoSums();
        twoSums.twoSum(arr,target);
        assertNotNull( twoSums.twoSum(arr,target),"Target " + target + " not found" );

    }

    @Test
    void twoSumTestValid03() {
        int[] arr = {3,3};
        int target = 6;
        TwoSums twoSums = new TwoSums();
        twoSums.twoSum(arr,target);
        assertNotNull( twoSums.twoSum(arr,target),"Target " + target + " not found" );

    }
}