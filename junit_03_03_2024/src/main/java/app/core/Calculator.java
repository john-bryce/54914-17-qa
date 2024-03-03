package app.core;

/**
 * this class represents a calculator with a current result that starts as 0.
 * this calculator supports basic arithmetical operations.
 */
public class Calculator {

    private double result;

    /**
     * add the value to the result
     *
     * @param value the value to be added to the result
     */
    public void add(double value) {
        result += value;
    }

    /**
     * return the current result of this calculator
     * @return the current result
     * */
    public double getResult() {
        return result;
    }


}
