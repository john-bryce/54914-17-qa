package a.arrays;

import java.util.Random;

public class Demo4 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(101);
            System.out.println(arr[i]);
        }
    }
}
