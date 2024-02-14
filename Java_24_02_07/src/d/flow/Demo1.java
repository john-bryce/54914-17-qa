package d.flow;

import java.util.Random;

public class Demo1 {

    public static void main(String[] args) {
        // to create random numbers we need a special object
        Random random = new Random();
        // creating a random number 0 - 10 inclusive
        int a = random.nextInt(11);
        // print the number
        System.out.println(a);

        // if the number is larger than 5, print Big
        if(a > 5) {
            System.out.println("Big");
        }
    }
}
