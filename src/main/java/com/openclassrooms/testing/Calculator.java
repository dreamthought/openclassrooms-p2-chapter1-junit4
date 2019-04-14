package com.openclassrooms.testing;

/**
 * A very basic calculator.
 * Handy if you lose your phone.
 */
public class Calculator implements CalculatorInterface {

    private ConversionCalculator conversionCalculator;

    /**
     * Constructor which requires a conversion calculator.
     *
     * @param conversionCalculator to handle conversions
     */
    public Calculator(ConversionCalculator conversionCalculator) {
        this.conversionCalculator = conversionCalculator;
    }

    /**
     * Adds the left argument to the right.
     *
     * @param left  The first number to be added
     * @param right A number to be added to the left argument
     * @return
     */
    public Double add(final Double left, final Double right) {
        return left + right;
    }

    /**
     * Subtracts one number from another.
     *
     * @param left  The first number to be added
     * @param right A number to be added to the left argument
     * @return result of the subtraction
     */
    public Double subtract(final Double left, final Double right) {
        return left - right;
    }

    /**
     * Converts a value based on the requested ConversionType.
     * @param type to convert to.
     * @param value to be converted.
     * @return converted value.
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
