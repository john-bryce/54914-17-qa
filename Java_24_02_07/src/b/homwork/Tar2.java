package b.homwork;

import java.util.Scanner;

public class Tar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.print("enter 1st number: ");
        a = sc.nextInt();
        System.out.print("enter 2nd number: ");
        b = sc.nextInt();
        System.out.print("enter 3rd number: ");
        c = sc.nextInt();
        System.out.print("enter 4th number: ");
        d = sc.nextInt();

        System.out.println(a + ", " + b + ", " + c + ", " + d);
        // 1. calculate and print sum
        int sum = a+b+c+d;
        System.out.println("sum = " + sum);

        // 2. calculate and print average
        double avg = sum / 4D;
        System.out.println("average = " + avg);

    }
}
