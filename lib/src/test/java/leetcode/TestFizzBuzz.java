package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {

    @Test
    public void testFizzBuzzThree() {
        List<String> actual = FizzBuzz.fizzBuzzSolution(3);
        List<String> expected = new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        assertEquals(actual, expected);

    }


    @Test
    public void testFizzBuzzFive() {
        List<String> actual = FizzBuzz.fizzBuzzSolution(5);
        List<String> expected = new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        assertEquals(actual, expected);

    }
}
