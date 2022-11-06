package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test void testIfPalindrome() {
        Palindrome palindromeTest = new Palindrome();
        assertTrue(palindromeTest.isPalindrome(121));
        assertFalse(palindromeTest.isPalindrome(-121));
        assertFalse(palindromeTest.isPalindrome(10));

    }

    @Test void testIfPalindromeUsingTwoPointers() {
        TwoPointers palindromeTest = new TwoPointers();
        assertTrue(palindromeTest.isPalindromeUsingTwoPointers("121"));
        assertFalse(palindromeTest.isPalindromeUsingTwoPointers("-121"));
        assertFalse(palindromeTest.isPalindromeUsingTwoPointers("10"));

    }
}
