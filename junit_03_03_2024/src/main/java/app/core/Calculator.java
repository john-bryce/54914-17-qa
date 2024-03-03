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
         result += value; // test pass
//        result += value + 100; // test fail
    }

    /**
     * subtract the value from the result
     *
     * @param value the value to be subtracted from the result
     */
    public void sub(double value) {
         result -= value;
    }

    public void mul(double value){
        result *= value;
    }

    public void div(double value){
        result /= value;
    }

    public void clear(){
         result = 0;
    }

    /**
     * return the current result of this calculator
     *
     * @return the current result
     */
    public double getResult() {
        return result;
    }

}
