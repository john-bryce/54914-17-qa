package d.flow;


import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Code: ");
        int userInput = sc.nextInt();

        if (userInput == 6879) {
            System.out.println("Code is correct");
        } else {
            System.out.println("Error");
        }

    }

}
