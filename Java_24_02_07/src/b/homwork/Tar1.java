package b.homwork;

import java.util.Scanner;


public class Tar1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter 1st number: ");
        int x = scanner.nextInt();

        System.out.print("enter 2nd number: ");
        int y = scanner.nextInt();

        int m = x * y;

        System.out.print(x);
        System.out.print(" * ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(m);

        // with concatenation, we can print many parts together
        System.out.println(x + " * " + y + " = " + m);




    }
}
