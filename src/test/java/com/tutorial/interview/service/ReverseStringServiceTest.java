package com.tutorial.interview.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ReverseStringServiceTest {

    @InjectMocks
    private ReverseStringService reverseStringService;

    @ParameterizedTest
    @CsvSource({
            "Hello World!, !dlroW olleH",
            "Java Programming, gnimmargorP avaJ",
            "Spring Boot, tooB gnirpS"
    })
    void testReverseStringV1(String input, String expected) {
        // when
        var actual = reverseStringService.reverseStringV1(input);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}
