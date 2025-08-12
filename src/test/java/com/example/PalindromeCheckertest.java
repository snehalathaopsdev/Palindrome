package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckertest {
    @Test
    public void testPalindromeTrue() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeFalse() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("hello"));
    }
}