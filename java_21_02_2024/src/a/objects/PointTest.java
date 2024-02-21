package a.objects;

public class PointTest {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.moveRight();
        p1.moveRight();
        p2.moveUp();

        p1.print();
        p2.print();
    }

}
