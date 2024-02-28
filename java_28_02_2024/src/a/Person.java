package a;

/*
 * a person age can be in the range 0 - 120
 * */
public class Person {
    int id;
    String name;
    // to protect age value make it private
    // so no one can change out of this class
    private int age;

    public void setAge(int newAge) throws Exception {
        if (newAge >= 0 && newAge <= 120) {
            age = newAge;
        }else{
            // throw an exception with message
            Exception e = new Exception("age must be 0 - 120");
            throw e;
        }
    }

    public int getAge(){
        return age;
    }
}
