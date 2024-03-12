package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSumWithPositiveNumbers() {
        double[] numbers = {1.0, 2.0, 3.0};
        double result = calculator.sum(numbers);
        assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testSumWithMixedNumbers() {
        double[] numbers = {1.0, -2.0, 3.0};
        double result = calculator.sum(numbers);
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void testSumWithEmptyArray() {
        double[] numbers = {};
        double result = calculator.sum(numbers);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testSubtractWithPositiveNumbers() {
        double[] numbers = {10.0, 2.0, 3.0};
        double result = calculator.subtract(numbers);
        assertEquals(5.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractWithEmptyArray() {
        double[] numbers = {};
        calculator.subtract(numbers);
    }

    @Test
    public void testMultiplicationWithPositiveNumbers() {
        double[] numbers = {2.0, 3.0, 4.0};
        double result = calculator.multiplication(numbers);
        assertEquals(24.0, result, 0.001);
    }

    @Test
    public void testMultiplicationWithMixedNumbers() {
        double[] numbers = {2.0, -3.0, 4.0};
        double result = calculator.multiplication(numbers);
        assertEquals(-24.0, result, 0.001);
    }

    @Test
    public void testMultiplicationWithEmptyArray() {
        double[] numbers = {};
        double result = calculator.multiplication(numbers);
        assertEquals(1.0, result, 0.001);
    }

    @Test
    public void testDivideWithValidInput() {
        double result = calculator.divide(10.0, 2.0);
        assertEquals(5.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10.0, 0.0);
    }

    @Test
    public void testSquareRootWithPositiveNumber() {
        double result = calculator.squareRoot(16.0);
        assertEquals(4.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootOfNegativeNumber() {
        calculator.squareRoot(-16.0);
    }

    @Test
    public void testModuloOfTwoNumWithPositiveValues() {
        double result = calculator.moduloOfTwoNum(10.0, 3.0);
        assertEquals(1.0, result, 0.001);
    }

    @Test
    public void testModuloOfTwoNumWithNegativeValueA() {
        double result = calculator.moduloOfTwoNum(-10.0, 3.0);
        assertEquals(-1.0, result, 0.001);
    }

    @Test
    public void testModuloOfTwoNumWithNegativeValueB() {
        double result = calculator.moduloOfTwoNum(10.0, -3.0);
        assertEquals(1.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testModuloOfTwoNumWithZeroB() {
        calculator.moduloOfTwoNum(10.0, 0.0);
    }

    @Test
    public void testAverageWithPositiveNumbers() {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double result = calculator.average(numbers);
        assertEquals(3.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageWithEmptyArray() {
        double[] numbers = {};
        calculator.average(numbers);
    }

    @Test
    public void testFactorialWithPositiveInteger() {
        int result = calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialWithZero() {
        int result = calculator.factorial(0);
        assertEquals(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWithNegativeInteger() {
        calculator.factorial(-5);
    }
}
