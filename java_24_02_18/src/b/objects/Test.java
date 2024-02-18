package b.objects;

public class Test {
    public static void main(String[] args) {
        // create one washing machine object
        WashingMachine machine1 = new WashingMachine();
        System.out.println(machine1.litersInMachine); // 0
        machine1.addWater(5);
        System.out.println(machine1.litersInMachine); // 5

        machine1.addWater(2);
        System.out.println(machine1.litersInMachine); // 7
        machine1.addWater(2);
        System.out.println(machine1.litersInMachine); // 9
        machine1.addWater(2);
        System.out.println(machine1.litersInMachine); // 10
        machine1.addWater(2);
        System.out.println(machine1.litersInMachine); // 10
        machine1.addWater(2);
        System.out.println(machine1.litersInMachine); // 10
        machine1.addWater(2);
        System.out.println(machine1.litersInMachine); // 10

    }
}
