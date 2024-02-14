package c.arrays;

import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = new int[100]; // create an array of length 100
        Random r = new Random(); // an object for creating random numbers

        // insert numbers to the array using for loop
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(11);
        }

        // print elements using for loop again
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

        // we could do it using one for loop
    }
}
