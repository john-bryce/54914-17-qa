package a.objects;

public class Point {
    int x;
    int y;

    void moveRight() {
        // x = x + 1;
        x++;
    }

    void moveLeft() {
        x--;
    }

    void moveUp() {
        y++;
    }

    void moveDown() {
        y--;
    }

    void print() {
        System.out.println("(" + x + ", " + y + ")");
    }

}
