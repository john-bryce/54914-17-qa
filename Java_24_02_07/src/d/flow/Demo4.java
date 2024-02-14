package d.flow;

import java.util.Random;

public class Demo4 {
    public static void main(String[] args) {
        double worldRecord = 9.69;
        System.out.println("world record is " + worldRecord);

        Random random = new Random();

        int runner1 = random.nextInt(21);
        int runner2 = random.nextInt(21);
        System.out.println("runner 1: " + runner1);
        System.out.println("runner 2: " + runner2);

        if (runner1 < runner2) {
            System.out.println("runner 1 wins");
            if (runner1 < worldRecord) {
                System.out.println("new world record!");
            }
        }

        if (runner2 < runner1) {
            System.out.println("runner 2 wins");
            if (runner2 < worldRecord) {
                System.out.println("new world record");
            }
        }

        if (runner1 == runner2) {
            System.out.println("tie");
            if (runner1 < worldRecord) {
                System.out.println("new world record");
            }
        }


    }
}
