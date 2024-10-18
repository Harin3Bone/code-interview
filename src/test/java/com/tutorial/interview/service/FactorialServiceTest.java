package com.tutorial.interview.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class FactorialServiceTest {

    @InjectMocks
    private FactorialService factorialService;

    @ParameterizedTest
    @CsvSource({
        "0, 1",
        "1, 1",
        "2, 2",
        "3, 6",
        "4, 24",
        "5, 120"
    })
    void testFactorial(int number, int expected) {
        // when
        var actual = factorialService.factorial(number);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}
