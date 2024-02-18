package a.arrays;

import java.util.Random;

public class Demo3 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        // insert 10 random numbers
        Random random = new Random();
        arr[0] = random.nextInt(11);
        arr[1] = random.nextInt(11);
        arr[2] = random.nextInt(11);
        arr[3] = random.nextInt(11);
        arr[4] = random.nextInt(11);
        arr[5] = random.nextInt(11);
        arr[6] = random.nextInt(11);
        arr[7] = random.nextInt(11);
        arr[8] = random.nextInt(11);
        arr[9] = random.nextInt(11);

        // print all elements:
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);
        System.out.println(arr[9]);
    }
}
