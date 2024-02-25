package a.objects;

public class TestPerson {
    public static void main(String[] args) {
        // create an object of the type Person
        Person dan = new Person();
        dan.id = 111;
        dan.name = "Dan";
        dan.age = 25;

        // create another object of the type Person
        Person lea = new Person();
        lea.id = 222;
        lea.name = "Lea";
        lea.age = 23;

        // use the object reference to activate it
        dan.sayHi();
        lea.sayHi();





    }
}
