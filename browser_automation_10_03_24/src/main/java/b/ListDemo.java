package b;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List list = new ArrayList(); // list starts with size 0
        System.out.println("list size: " + list.size());

        list.add("aaa");
        list.add(5);
        list.add(true);
        System.out.println("list size: " + list.size());

        System.out.println(list);

    }
}
