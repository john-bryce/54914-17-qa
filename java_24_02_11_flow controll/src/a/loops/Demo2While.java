package a.loops;


import java.util.Scanner;

public class Demo2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        int sum = 0;
        while(c <= 10){
            System.out.print("enter number: ");
            int input = sc.nextInt();
            sum = sum + input;
            c = c + 1;
        }
        System.out.println(sum);
    }
}
