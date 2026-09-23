package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit Parameterized Test - Subtraction
 */
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest(name = "subtract({0}, {1}) = {2}")
    @CsvSource({
            "5, 2, 3",
            "10, 5, 5",
            "20, 7, 13",
            "7, 2, 5",
            "2, 7, -5",
            "100, 50, 50"
    })
    void testSubtract(int a, int b, int expected) {
        int actual = calculator.subtract(a, b);
        assertEquals(expected, actual,
                () -> "subtract(" + a + ", " + b + ") should be " + expected);
    }
}
