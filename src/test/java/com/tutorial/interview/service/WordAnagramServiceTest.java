package com.tutorial.interview.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class WordAnagramServiceTest {

    @InjectMocks
    private WordAnagramService wordAnagramService;

    @ParameterizedTest
    @CsvSource(value = {
            "word, word, true",
            "word, drow, true",
            "word, words, false",
            "word, drtw, false"
    }, delimiter = ',')
    void testForIsAnagramV1(String word1, String word2, boolean expected) {
        // when
        var actual = wordAnagramService.isAnagramV1(word1, word2);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "word, word, true",
            "word, drow, true",
            "word, words, false",
            "word, drtw, false"
    }, delimiter = ',')
    void testForIsAnagramV2(String word1, String word2, boolean expected) {
        // when
        var actual = wordAnagramService.isAnagramV2(word1, word2);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}
