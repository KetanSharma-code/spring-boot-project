package com.luv2code.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {

    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testForDivisibleByThree() {
        String expected = "Fizz";
        assertEquals(expected,FizzBuzz.compute(3));
    }

    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testForDivisibleByFive() {
        String expected = "Buzz";
        assertEquals(expected,FizzBuzz.compute(5));
    }

    @DisplayName("Divisible by Three and Five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive() {
        String expected = "FizzBuzz";
        assertEquals(expected,FizzBuzz.compute(15));
    }

    @DisplayName("Not Divisible by Three or Five")
    @Test
    @Order(4)
    void testForDivisibleByThreeOrFive() {
        String expected = "1";
        assertEquals(expected,FizzBuzz.compute(1));
    }


    // Behind the scenes, JUnit will run the test multiple
    // times and supply the data for the parameters.
    // JUnit will do looping for us.
    @DisplayName("Testing with small data file")
    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(5)
    void testSmallDataFile(int value, String expected) {
        assertEquals(expected,FizzBuzz.compute(value));
    }
}
