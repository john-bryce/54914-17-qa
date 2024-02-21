package a.objects;

public class ParkingLot {

    Car[] cars = new Car[100];
    int index; // start at 0

    void addCar(Car car){
        cars[index] = car;
        index++; // move the index to the next parking spot
    }

}
