package a;

public class CalculatorTest {

    public static void main(String[] args) {

        try {
            Calculator calculator = new Calculator();
            int result = calculator.divide(100, 0);
            System.out.println(result);
        }catch(Exception e){
            // handler - the code that will in case of an exception
            System.out.println("there was an error");
        }

    }
}
