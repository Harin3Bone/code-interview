package com.tutorial.interview.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;

@Service
public class MaxTwoNumberService {

    /**
     * Find the first and second max value from the given array of integer numbers.
     * This method uses a single loop to find the first and second max value.
     *
     * @param numbers array of integer numbers
     * @return array of two integer numbers with first and second max value
     */
    public int[] maxTwoNumberV1(int[] numbers) {
        var maxNumber = Integer.MIN_VALUE;
        var secondMaxNumber = 0;
        for (var number : numbers) {
            if (number > maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = number;
            } else if (number > secondMaxNumber) {
                secondMaxNumber = number;
            }
        }

        return new int[]{maxNumber, secondMaxNumber};
    }

    /**
     * Find the first and second max value from the given array of integer numbers.
     * This method uses a Collection stream to sort the array in descending order
     * and then get the first and second value.
     *
     * @param numbers array of integer numbers
     * @return array of two integer numbers with first and second max value
     */
    public int[] maxTwoNumberV2(int[] numbers) {
        var newNumbers = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toList();

        return new int[]{newNumbers.get(0), newNumbers.get(1)};
    }

}
