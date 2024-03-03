package app.core;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void addTest() {
        calculator.add(5); // the expected result should be 5
        // test that the expected current result is 5
        Assertions.assertEquals(5, calculator.getResult());
    }

    @Test
    void subtractTest(){
        calculator.sub(7); // the expected result should be -7
        double expected = -7;
        double actual = calculator.getResult();
        Assertions.assertEquals(expected, actual);
    }
}
