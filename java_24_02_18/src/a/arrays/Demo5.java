package a.arrays;

import java.util.Random;

public class Demo5 {

    public static void main(String[] args) {
        int[] arr = new int[25];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
            System.out.println(arr[i]);
            sum = sum + arr[i]; // add the element to the sum
        }

        System.out.println("===================");
        System.out.println("sum = " + sum); // print the sum

        double avg = sum / (double)arr.length; // calculate average
        System.out.println("average = " + avg); // print the average

    }
}
