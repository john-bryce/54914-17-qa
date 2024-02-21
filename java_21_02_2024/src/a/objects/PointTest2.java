package a.objects;

public class PointTest2 {

    public static void main(String[] args) {
        // create a Point object
        Point point = new Point(); // (0, 0)

        // move the point 100 steps to the right and 30 steps up (100, 30)
        for (int i = 0; i < 100; i++) {
            point.moveRight(); // this will happen 100 times
        }

        for (int i = 0; i < 30; i++) {
            point.moveUp(); // this will happen 30 times
        }

        point.print();

    }
}
