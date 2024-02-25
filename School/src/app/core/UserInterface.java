package app.core;

import java.util.Scanner;

public class UserInterface {

    static Scanner sc = new Scanner(System.in);
    static School school = new School();

    public static void main(String[] args) {
        while (true){
            showMenu();
            int userInput = sc.nextInt();
            if(userInput==1){
                System.out.println("adding teacher");
                Teacher teacher = new Teacher();
                System.out.print("enter teacher id: ");
                teacher.id = sc.nextInt();
                sc.nextLine();
                System.out.print("enter teacher name: ");
                teacher.name = sc.nextLine();
                System.out.print("enter teacher subject: ");
                teacher.subject = sc.nextLine();
                school.addTeacher(teacher);
            }else if(userInput==2){
                System.out.println("add student");
            }else if(userInput==3){
                school.showTeachers();
            }else if(userInput==4){
                System.out.println("show all students");
            }else if(userInput==5){
                System.out.println("exit");
                sc.close();
                break;
            }
        }
        System.out.println("Bye!!!");

    }

    static void showMenu(){
        System.out.println("Menu ============");
        System.out.println("add teacher ............. 1");
        System.out.println("add student ............. 2");
        System.out.println("show teachers ........... 3");
        System.out.println("show students ........... 4");
        System.out.println("exit .....................5");
        System.out.print("Enter your choice: ");
    }
}
