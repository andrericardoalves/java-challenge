package org.example;



import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringTest {

    @Test
    public void shouldFindTheLengthLongString(){
        LongestSubstring  longString = new LongestSubstring();
        assertEquals(longString.lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(longString.lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(longString.lengthOfLongestSubstring("pwwkew"), 3);
    }

    @Test
    public void shouldFindTheLengthLongStringFast(){
        LongestSubstring  longString = new LongestSubstring();
        assertEquals(longString.lengthOfLongestSubstringFast("abcabcbb"), 3);
        assertEquals(longString.lengthOfLongestSubstringFast("bbbbb"), 1);
        assertEquals(longString.lengthOfLongestSubstringFast("pwwkew"), 3);
    }

    @Test
    public void shouldFindTheLengthLongStringFaster(){
        LongestSubstring  longString = new LongestSubstring();
        assertEquals(longString.lengthOfLongestSubstringFaster("abcabcbb"), 3);
        assertEquals(longString.lengthOfLongestSubstringFaster("bbbbb"), 1);
        assertEquals(longString.lengthOfLongestSubstringFaster("pwwkew"), 3);
    }

}