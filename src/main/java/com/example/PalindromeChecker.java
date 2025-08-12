package com.example;

public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        if (str == null) return false;
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String word = "madam";
        System.out.println("Is '" + word + "' a palindrome? " + checker.isPalindrome(word));
    }
}