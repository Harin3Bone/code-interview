package com.tutorial.interview.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MaxTwoNumberServiceTest {

    @InjectMocks
    private MaxTwoNumberService maxTwoNumberService;

    @ParameterizedTest
    @MethodSource("sourceForTestMaxTwoNumber")
    void testMaxTwoNumberV1(int[] numbers, int[] expected) {
        // when
        var actual = maxTwoNumberService.maxTwoNumberV1(numbers);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("sourceForTestMaxTwoNumber")
    void testMaxTwoNumberV2(int[] numbers, int[] expected) {
        // when
        var actual = maxTwoNumberService.maxTwoNumberV2(numbers);

        // then
        assertThat(actual).isEqualTo(expected);
    }


    private static Stream<Arguments> sourceForTestMaxTwoNumber() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4}),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, new int[]{5, 4}),
                Arguments.of(new int[]{-1, -2, 0, 1, 2}, new int[]{2, 1}),
                Arguments.of(new int[]{1, 2, 0, -1, -2}, new int[]{2, 1}),
                Arguments.of(new int[]{-1, -2, -3, -4, -5}, new int[]{-1, -2}),
                Arguments.of(new int[]{-5, -4, -3, -2, -1}, new int[]{-1, -2})
        );
    }

}
