package app.core;


import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @Order(100)
    void addTest() {
        calculator.add(5); // the expected result should be 5
        // test that the expected current result is 5
        Assertions.assertEquals(5, calculator.getResult());
    }

    @Test
    @Order(2)
    void subtractTest() {
        calculator.sub(7); // the expected result should be -7
        double expected = -7;
        double actual = calculator.getResult();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Order(3)
    void multiplyTest() {
        calculator.add(10); // result is now 10
        calculator.mul(3); // result is now 30
        double expected = 30;
        double actual = calculator.getResult();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Order(4)
    void divideTest(){
        calculator.add(10); // result is now 10
        calculator.div(2); // result is now 5
        Assertions.assertEquals(5, calculator.getResult());
    }
    @Test
    @Order(5)
    void divideByZeroTest(){
        calculator.add(10); // result is now 10
        System.out.println(calculator.getResult()); // see Infinity in the output
        calculator.div(0); // result is now infinity
        System.out.println(calculator.getResult()); // see Infinity in the output
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.getResult());
    }

    @Test
    @Order(6)
    void clear(){
        calculator.add(100); // result is now 100
        calculator.clear(); // result is now expected to be 0
        Assertions.assertEquals(0, calculator.getResult(), "clear is not working");
    }
}
