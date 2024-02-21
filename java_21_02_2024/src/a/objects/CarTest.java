package a.objects;

public class CarTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.print();

        car.drive(30);
        car.print();

        car.drive(2);
        car.print();
    }
}
