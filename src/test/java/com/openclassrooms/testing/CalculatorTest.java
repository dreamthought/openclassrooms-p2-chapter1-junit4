package com.openclassrooms.testing;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Part 2 - Chapter 1
 * Here are some nice reminders of how you can use the standard annotations we covered.
 *
 * @author Raf Gemmail
 */
public class CalculatorTest {
    private Calculator calculatorUnderTest = new Calculator();

    // Checkout this site to see other popular naming conventions
    // https://dzone.com/articles/7-popular-unit-test-naming
    @Test
    public void add_returnsTheSum_OfTwoPositiveNumbers() {
        Double expected = 3.0;
        Double sum = calculatorUnderTest.add(1.0, 2.0);
        assertThat(sum, is(equalTo(expected)));
    }

    @Test
    public void add_returnsTheSum_OfTwoNegativeNumbers() {
        Double expected = -3.0;
        Double sum = calculatorUnderTest.add(-1.0, -2.0);
        assertThat(sum, is(equalTo(expected)));
    }

    @Test
    public void subtract_returnsTheDifference_BetweenTwoNumbers() {
        Double expected = -2.0;
        Double difference = calculatorUnderTest.subtract(3.0, 5.0);
        assertThat(difference, is(equalTo(expected)));
    }
}
