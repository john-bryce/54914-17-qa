package b.errors;

public class Calculator {

    void m1() {
        System.out.println("aaa");
        System.out.println("bbb");
        // return;
    }

    String m2() {
        System.out.println("aaa");
        System.out.println("bbb");
        return "we must some string";
    }

    // how to correct this method
    // so there is no error if
    // b is 0
    int divide(int a, int b) throws Exception {
        if (b != 0) {
            int result = a / b;
            return result;
        } else {
            // create an object of type Exception
            Exception exception = new Exception("you cannot divide by 0");
            // throw the exception (not return)
            throw exception;
        }
    }

}
