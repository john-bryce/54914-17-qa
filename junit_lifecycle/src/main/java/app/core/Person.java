package app.core;

public class Person {

    private int id;
    private String name;
    private int age; // non static members belong to the object

    private static int maxAge = 120; // static members belong to the class

    // this is a constructor method
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println(Person.maxAge);
        // because we have a constructor we can create person with data
        Person p1 = new Person(111, "Moshe", 35);
        Person p2 = new Person(222, "Lea", 25);

        // print
        System.out.println(p1.id); // 111
        System.out.println(p1.name); // Moshe
        System.out.println(p1.age); // 32

        System.out.println(p2.id); // 222
        System.out.println(p2.name); // Lea
        System.out.println(p2.age); // 25
    }
}
