package c;

public class Demo2Casting {

    public static void main(String[] args) {

        // 1. cast from small type to bigger type is easy
        byte x = 5;
        int y = x; // casting from byte to int (implicit)

        System.out.println(x);
        System.out.println(y);

        // 2. cast from big type to smaller type is dangerous
        int a = 100;
        byte b = (byte)a; // casting from int to byte (explicit)

        // 3. cast from decimal to integer
        double n1 = 45.325;
        int n2 = (int)n1; // explicit cast from double to int

        System.out.println(n1);
        System.out.println(n2);
    }
}
