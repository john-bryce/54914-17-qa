package b.objects;

public class Demo1 {

    public static void main(String[] args) {
        // create an object of type Person
        Person p1 = new Person();
        // give values to the fields (id, name, age)
        // using the . operator we access the fields
        p1.id = 123;
        p1.name = "Dan";
        p1.age = 27;
        // print the object values: id, name and age
        p1.print();
    }
}
