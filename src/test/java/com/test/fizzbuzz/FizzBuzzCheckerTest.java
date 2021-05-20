package com.test.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzCheckerTest {

    final FizzBuzzChecker fbChecker = new FizzBuzzChecker();

    @Test
    void lessThanNumberCheckTest() {
        assertFalse(fbChecker.numberCheck(1,2));
    }

    @Test
    void noFizzBuzzCheckTest() {
        assertFalse(fbChecker.numberCheck(7,3));
    }

    @Test
    void sameNumberCheckTest() {
        assertTrue(fbChecker.numberCheck(3,3));
    }

    @Test
    void modulusNumberCheckTest() {
        assertTrue(fbChecker.numberCheck(33,3));
        assertTrue(fbChecker.numberCheck(99,3));
    }

    @Test
    void numberPresentCheckTest() {
        assertTrue(fbChecker.numberCheck(13,3));
    }

}
