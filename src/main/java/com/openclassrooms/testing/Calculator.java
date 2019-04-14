package com.openclassrooms.testing;

/**
 * A very basic calculator.
 * Handy if you lose your phone.
 */
public class Calculator implements CalculatorInterface {

    private ConversionCalculator conversionCalculator;


    /**
     * {@inheritDoc}
     */
    public Calculator(ConversionCalculator conversionCalculator) {
        this.conversionCalculator = conversionCalculator;
    }

    /**
     * {@inheritDoc}
     */
    public Double add(final Double left, final Double right) {
        return left + right;
    }

    /**
     * {@inheritDoc}
     */
    public Double subtract(final Double left, final Double right) {
        return left - right;
    }

    /**
     * {@inheritDoc}
     */
    public Double convert(ConversionType type, Double value) throws Exception {
        Double result = null;
        switch(type) {
            case RADIUS_TO_AREA:
                result = conversionCalculator.radiusToAreaOfCircle(value);
                break;
            default:
                //FIXME: Create a custom exception
                throw new Exception("Unknown ConversionType");
        }
        return result;
    }
}
