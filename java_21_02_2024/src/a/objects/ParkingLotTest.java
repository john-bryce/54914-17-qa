package a.objects;

public class ParkingLotTest {
    public static void main(String[] args) {
        // create a ParkingLot object
        ParkingLot parkingLot = new ParkingLot();

        // create 3 Car objects
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        // add the cars to the parking lot
        parkingLot.addCar(car1);
        parkingLot.addCar(car2);
        parkingLot.addCar(car3);

        // print the cars in positions 0, 1, 2, 3
        System.out.println(parkingLot.cars[0]); // car
        System.out.println(parkingLot.cars[1]); // car
        System.out.println(parkingLot.cars[2]); // car
        System.out.println(parkingLot.cars[3]); // null (no car here)



    }
}
