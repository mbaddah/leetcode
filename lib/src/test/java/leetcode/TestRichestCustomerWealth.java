package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//  Problem 1672
public class TestRichestCustomerWealth {

    @Test
    void testRichestCustomer() {
        int[][] arr = {{1,2,3},
                {3,2,1}};
        int[][] arr02 = { {1,5}, {7,3}, {3,5} };
        int[][] arr03 = { {2,8,7}, {7,1,3}, {1,9,5} };


        assertEquals(6,RichestCustomerWealth.maximumWealthSolution(arr));
        assertEquals(10,RichestCustomerWealth.maximumWealthSolution(arr02));
        assertEquals(17,RichestCustomerWealth.maximumWealthSolution(arr03));

    }
}
