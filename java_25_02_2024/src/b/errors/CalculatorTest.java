package b.errors;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.divide(10, 5)); // 2
        System.out.println(calc.divide(100, 5)); // 20
        System.out.println(calc.divide(20, 5)); // 4
        System.out.println(calc.divide(30, 5)); // 6
    }
}
