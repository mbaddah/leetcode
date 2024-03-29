package leetcode;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NumberStepsZero {
    public static int countNumberStepsToZero(int num) {
        int counter = 0;
        while(num != 0) {
            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            counter++;
        }
        return counter;
    }
}
