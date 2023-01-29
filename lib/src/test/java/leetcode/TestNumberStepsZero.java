package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberStepsZero {

    @Test
    public void testNumberStepsZero() {
        int numberSteps14 = NumberStepsZero.countNumberStepsToZero(14);
        int numberSteps8 = NumberStepsZero.countNumberStepsToZero(8);
        int numberSteps123 = NumberStepsZero.countNumberStepsToZero(123);


        assertEquals(6, numberSteps14);
        assertEquals(4, numberSteps8);
        assertEquals(12, numberSteps123);


    }
}
