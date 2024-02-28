package a;

public class PersonTest {

    public static void main(String[] args) {

        Person p = new Person();
        // to set the age use setAge method
        try{
            p.setAge(50);
        }catch(Exception e){
            System.out.println("error setting age");
        }

        // to get the age use getAge method
        System.out.println(p.getAge());
    }
}
