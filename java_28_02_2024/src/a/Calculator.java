package a;

public class Calculator {

    int divide(int a, int b) throws Exception {
        try {
            return a / b;
        } catch (Exception e) {
            // create an exception object
            Exception myException = new Exception("you cannot divide by 0");
            // throw the exception
            throw myException;
        }
    }
}
