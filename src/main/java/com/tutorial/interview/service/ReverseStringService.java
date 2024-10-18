package com.tutorial.interview.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseStringService {

    /**
     * Reverse the given string value.
     * This method uses a StringBuilder to reverse the string value.
     *
     * @param input string value
     * @return reversed string value
     */
    public String reverseStringV1(String input) {
        var result = new StringBuilder();
        for (var i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}
