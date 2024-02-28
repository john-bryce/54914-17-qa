package app.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    // junit annotation
    @Test
    void testAdd(){
        calculator.add(5);
        double expected = 5;
        double actual = calculator.getResult();
        // junit code - check that after adding 5 the result is 5
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testClear(){
        calculator.clear();
        double expected = 0;
        double actual = calculator.getResult();
        Assertions.assertEquals(expected, actual);
    }
}
