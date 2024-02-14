package a.loops;
import java.util.Random;

public class Demo4For {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 1; i <= 25; i++){
            int r = random.nextInt(101);
            System.out.println(i + ") " + r);
        }
    }
}
