package leetcode;

public class RunningSums {

    public int[] runningSum(int[] nums) {

        int[] runningSums = new int[nums.length];
        runningSums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSums[i] = nums[i] + runningSums[i - 1];
        }

        return runningSums;
    }
}
