package com.tutorial.interview.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class FibonacciServiceTest {

    @InjectMocks
    private FibonacciService fibonacciService;

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,1",
            "3,2",
            "4,3",
            "5,5",
            "6,8",
            "7,13"
    })
    void testFactorial(int number, int expected) {
        // when
        var actual = fibonacciService.fibonacci(number);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}
