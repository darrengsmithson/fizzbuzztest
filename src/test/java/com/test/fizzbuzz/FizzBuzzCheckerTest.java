package com.test.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzCheckerTest {

    final FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();

    @Test
    void lessThanCriteriaNumberCheckTest() {
        assertFalse(fizzBuzzChecker.criteriaCheck(1,2));
    }

    @Test
    void notDivisibleByOrNumberPresentCheckTest() {
        assertFalse(fizzBuzzChecker.criteriaCheck(7,3));
    }

    @Test
    void sameNumberCheckTest() {
        assertTrue(fizzBuzzChecker.criteriaCheck(3,3));
    }

    @Test
    void divisibleByNumberCheckTest() {
        assertTrue(fizzBuzzChecker.criteriaCheck(33,3));
        assertTrue(fizzBuzzChecker.criteriaCheck(99,3));
    }

    @Test
    void numberPresentCheckTest() {
        assertTrue(fizzBuzzChecker.criteriaCheck(13,3));
    }

}
