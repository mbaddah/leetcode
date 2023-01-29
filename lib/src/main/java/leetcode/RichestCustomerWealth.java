package leetcode;

//  Problem 1672
public class RichestCustomerWealth {
    public static int maximumWealthSolution(int[][] accounts) {
        int maximum = 0;
        int current = 0;

        for (int i = 0; i < accounts.length; i++) {

            if (current > maximum) {
                maximum = current;
            }
            current = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                current += accounts[i][j];
            }
        }

        return maximum;
    }
}
