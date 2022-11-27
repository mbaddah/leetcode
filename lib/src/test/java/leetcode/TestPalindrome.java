package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPalindrome {
    @Test void testIfPalindrome() {
        assertTrue(Palindrome.isPalindrome(121));
        assertFalse(Palindrome.isPalindrome(-121));
        assertFalse(Palindrome.isPalindrome(10));

    }

    @Test void testIfPalindromeUsingTwoPointers() {
        assertTrue(TwoPointers.isPalindromeUsingTwoPointers("121"));
        assertFalse(TwoPointers.isPalindromeUsingTwoPointers("-121"));
        assertFalse(TwoPointers.isPalindromeUsingTwoPointers("10"));

    }
}
