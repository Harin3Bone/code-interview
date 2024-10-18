package com.tutorial.interview.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
