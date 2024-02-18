package b.objects;

public class WashingMachine {
    // attributes of a washing machine
    String color;
    int height;
    int length;
    int depth;
    int litersInMachine;
    int maxLiters = 10;

    // methods - the operations of a washing machine
    int addWater(int liters) {
        if (litersInMachine + liters <= maxLiters) {
            litersInMachine = litersInMachine + liters;
        }else{
            litersInMachine = maxLiters;
        }
        return litersInMachine;
    }


}
