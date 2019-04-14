package com.openclassrooms.testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * A suite of tests which prove our Calculator works.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CalculatorTest.class,
    ConversionCalculatorTest.class
})
public class CalculatorTestSuite {
}
