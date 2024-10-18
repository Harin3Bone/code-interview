package com.tutorial.interview.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ParenthesisServiceTest {

    @InjectMocks
    private ParenthesisService parenthesisService;

    @ParameterizedTest
    @CsvSource({
            "{X+(Y-[A+B])*C-[(D+E)]}/(H-(J-(K-[L-N]))), true",
            "{X+(Y-[A+B})*C-((D+E)]}/(H-(J-(K-[L-N]])), false"
    })
    void testIsValidParenthesis(String formula, boolean expected) {
        // when
        var actual = parenthesisService.isValidParenthesis(formula);

        // then
        assertThat(actual).isEqualTo(expected);
    }
}
