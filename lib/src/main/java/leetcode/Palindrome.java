package leetcode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder(str);
        String reversedX = sb.reverse().toString();
        System.out.println("ReversedX = " + reversedX);
        System.out.println("x = " + str);
        if (reversedX.equals(str)) {
            return true;
        } else {
            return false;
        }
    }




}
