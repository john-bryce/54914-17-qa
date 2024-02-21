package a.objects;

public class Car {

    int km;

    void drive(int distance){
        km = km + distance;
    }

    void print(){
        System.out.println("km = " + km);
    }

}
