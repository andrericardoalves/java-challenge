package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicTest {

    @Test
    void shouldFoundLongestPalindrome() {

        LongestPalindromic lp = new LongestPalindromic();
        String result = lp.longestPalindrome("babad");
        assertEquals(result, "bab");

    }

    @Test
    void shouldFoundLongestPalindromeSecond() {

        LongestPalindromic lp = new LongestPalindromic();
        String result = lp.longestPalindrome("cbbd");
        assertEquals(result, "bb");

    }
}