package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if(currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1){
                    break;
                }
                currentSubstring.append(s.charAt(j));
                maxLength = Math.max(maxLength, currentSubstring.length());
            }
        }
        return maxLength;
    }

    public int lengthOfLongestSubstringFast(String s) {

        int maxLength = 0;

        Map<Character, Integer> visitedCharacters = new HashMap<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentCharacter = s.charAt(right);
            if (visitedCharacters.containsKey(currentCharacter) &&
                visitedCharacters.get(currentCharacter) >= left){
                  left = visitedCharacters.get(currentCharacter) + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            visitedCharacters.put(currentCharacter, right);
        }
        return maxLength;
    }

    public int lengthOfLongestSubstringFaster(String s) {

        int maxLength = 0;


        for (int right = 0, left = 0; right < s.length(); right++) {
            int indexOfOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right), left);

            if(indexOfOfFirstAppearanceInSubstring != right){
                left = indexOfOfFirstAppearanceInSubstring + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }
}
