package com.sonarQubeProblem.sonarQube;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class GoodOrBadTest {
    
	GoodOrBadInput obj = new GoodOrBadInput();
    
    // Tests for inputChecker method
    @Test
    void testGoodOrBadNegative() {
        String result = obj.inputChecker(-6);
        assertEquals("Bad input", result);
    }
    
    @Test
    void testGoodOrBadZero() {
        String result = obj.inputChecker(0);
        assertEquals("Good input", result);
    }

    @Test
    void testGoodOrBadPositive() {
        String result = obj.inputChecker(10);
        assertEquals("Good input", result);
    }

    @Test
    void testGoodOrBadLargeNegative() {
        String result = obj.inputChecker(-1000);
        assertEquals("Bad input", result);
    }

    @Test
    void testGoodOrBadLargePositive() {
        String result = obj.inputChecker(1000);
        assertEquals("Good input", result);
    }

    // Tests for validateRange method
    @Test
    void testValidateRangeInRange() {
        String result = obj.validateRange(5, 0, 10);
        assertEquals("In range", result);
    }

    @Test
    void testValidateRangeBelowMin() {
        String result = obj.validateRange(-5, 0, 10);
        assertEquals("Out of range", result);
    }

    @Test
    void testValidateRangeAboveMax() {
        String result = obj.validateRange(15, 0, 10);
        assertEquals("Out of range", result);
    }

    @Test
    void testValidateRangeAtMin() {
        String result = obj.validateRange(0, 0, 10);
        assertEquals("In range", result);
    }

    @Test
    void testValidateRangeAtMax() {
        String result = obj.validateRange(10, 0, 10);
        assertEquals("In range", result);
    }

    // Tests for isPrime method
    @Test
    void testIsPrimeTrue() {
        assertTrue(obj.isPrime(7));
        assertTrue(obj.isPrime(11));
        assertTrue(obj.isPrime(13));
        assertTrue(obj.isPrime(17));
    }

    @Test
    void testIsPrimeFalse() {
        assertFalse(obj.isPrime(4));
        assertFalse(obj.isPrime(6));
        assertFalse(obj.isPrime(9));
        assertFalse(obj.isPrime(15));
    }

    @Test
    void testIsPrimeEdgeCases() {
        assertFalse(obj.isPrime(0));
        assertFalse(obj.isPrime(1));
        assertFalse(obj.isPrime(-5));
        assertTrue(obj.isPrime(2));
        assertTrue(obj.isPrime(3));
    }

    // Tests for sumOfDigits method
    @Test
    void testSumOfDigitsPositive() {
        assertEquals(6, obj.sumOfDigits(123));
        assertEquals(15, obj.sumOfDigits(555));
        assertEquals(1, obj.sumOfDigits(1));
    }

    @Test
    void testSumOfDigitsNegative() {
        assertEquals(6, obj.sumOfDigits(-123));
        assertEquals(15, obj.sumOfDigits(-555));
    }

    @Test
    void testSumOfDigitsZero() {
        assertEquals(0, obj.sumOfDigits(0));
    }

    @Test
    void testSumOfDigitsLargeNumber() {
        assertEquals(36, obj.sumOfDigits(9999));
        assertEquals(45, obj.sumOfDigits(123456789));
    }

    // Tests for isEven method
    @Test
    void testIsEvenTrue() {
        assertTrue(obj.isEven(0));
        assertTrue(obj.isEven(2));
        assertTrue(obj.isEven(4));
        assertTrue(obj.isEven(-2));
        assertTrue(obj.isEven(-4));
    }

    @Test
    void testIsEvenFalse() {
        assertFalse(obj.isEven(1));
        assertFalse(obj.isEven(3));
        assertFalse(obj.isEven(5));
        assertFalse(obj.isEven(-1));
        assertFalse(obj.isEven(-3));
    }

    // Tests for getNumberType method
    @Test
    void testGetNumberTypeZero() {
        assertEquals("Zero", obj.getNumberType(0));
    }

    @Test
    void testGetNumberTypePositiveEven() {
        assertEquals("Positive Even", obj.getNumberType(2));
        assertEquals("Positive Even", obj.getNumberType(10));
        assertEquals("Positive Even", obj.getNumberType(100));
    }

    @Test
    void testGetNumberTypePositiveOdd() {
        assertEquals("Positive Odd", obj.getNumberType(1));
        assertEquals("Positive Odd", obj.getNumberType(5));
        assertEquals("Positive Odd", obj.getNumberType(99));
    }

    @Test
    void testGetNumberTypeNegativeEven() {
        assertEquals("Negative Even", obj.getNumberType(-2));
        assertEquals("Negative Even", obj.getNumberType(-10));
        assertEquals("Negative Even", obj.getNumberType(-100));
    }

    @Test
    void testGetNumberTypeNegativeOdd() {
        assertEquals("Negative Odd", obj.getNumberType(-1));
        assertEquals("Negative Odd", obj.getNumberType(-5));
        assertEquals("Negative Odd", obj.getNumberType(-99));
    }
}
