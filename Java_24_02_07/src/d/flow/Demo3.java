package d.flow;

import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {

        Random ran = new Random();

        int a = ran.nextInt(11);
        int b = ran.nextInt(11);

        System.out.println("a = " + a + ", b = " + b);

        if (a > b) {
            System.out.println("maximum is " + a);
        } else {
            System.out.println("maximum is " + b);
        }

    }
}
