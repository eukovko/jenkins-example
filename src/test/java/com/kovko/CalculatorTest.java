package com.kovko;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addSuccess() {
        Calculator calculator = new Calculator();
        int expected = 13;
        int a = 5;
        int b = 8;
        int actual = calculator.add(a, b);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void addFail() {
        Calculator calculator = new Calculator();
        int expected = 13;
        int a = 5;
        int b = 9;
        int actual = calculator.add(a, b);
        assertThat(actual).isNotEqualTo(expected);
    }
}