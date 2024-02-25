package b.errors;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            System.out.println(calc.divide(10, 5)); // 2
            System.out.println(calc.divide(100, 5)); // 20

            System.out.println(calc.divide(100, 0)); // error

            System.out.println(calc.divide(20, 5)); // 4
            System.out.println(calc.divide(30, 5)); // 6
        }catch(Exception e){
            // what to do in case of an exception
            System.out.println("there was an error");
        }
    }
}
