package eldar.com;

public class Targil2 {
    public static void main(String[] args) {
        // to get input from user we need an object of type Scanner
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // calculate sum of 2 numbers
        System.out.println("enter 1st number");
        int x = sc.nextInt();
        System.out.println("enter 2nd number");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.print(x);
        System.out.print(" + ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(sum);
        // la la la
    }
}
