package com.tutorial.interview.service;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class ParenthesisService {

    public boolean isValidParenthesis(String s) {
        var charArray = s.toCharArray();
        var stack = new Stack<Character>();

        for (var character : charArray) {
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else if (character == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (character == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (character == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
