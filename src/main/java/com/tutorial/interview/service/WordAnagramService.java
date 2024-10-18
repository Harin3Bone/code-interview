package com.tutorial.interview.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;

@Service
public class WordAnagramService {

    /**
     * Are both words are anagram or not?
     * This method is case-insensitive and using sorting for comparison of two words.
     *
     * @param word1 base word
     * @param word2 compare word
     */
    public boolean isAnagramV1(String word1, String word2) {
        if (!isWordLengthEqual(word1, word2)) return false;

        // Transform word to a lower case for ignored case sensitivity and convert them into a char array
        char[] word1Array = convertStringToCharArray(word1, false);
        char[] word2Array = convertStringToCharArray(word2, false);

        // Sort the char array
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        return Arrays.equals(word1Array, word2Array);
    }

    /**
     * Are both words are anagram or not?
     * This method is case-insensitive and using hash map for comparison of two words.
     *
     * @param word1 base word
     * @param word2 compare word
     */
    public boolean isAnagramV2(String word1, String word2) {
        if (!isWordLengthEqual(word1, word2)) return false;

        // Transform word to a lower case for ignore case sensitivity and convert them into a char array
        char[] word1Array = convertStringToCharArray(word1, false);
        char[] word2Array = convertStringToCharArray(word2, false);

        // Map the word
        var word1Map = new HashMap<Character, Integer>();
        for (char c : word1Array) {
            if (word1Map.containsKey(c)) {
                word1Map.put(c, word1Map.get(c) + 1);
            } else {
                word1Map.put(c, 1);
            }
        }

        var word2Map = new HashMap<Character, Integer>();
        for (char c : word2Array) {
            if (word2Map.containsKey(c)) {
                word2Map.put(c, word2Map.get(c) + 1);
            } else {
                word2Map.put(c, 1);
            }
        }

        return word1Map.equals(word2Map);
    }

    private boolean isWordLengthEqual(String word1, String word2) {
        return word1.length() == word2.length();
    }

    private char[] convertStringToCharArray(String word, boolean mustSensitive) {
        return mustSensitive
                ? word.toCharArray()
                : word.toLowerCase().toCharArray();
    }
}
