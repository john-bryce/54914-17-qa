package b;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

    public static void main(String[] args) {

        // an array of String elements of length 3
        String[] arr1 = new String[3];
        arr1[0] = "aaa";
        arr1[1] = "bbb";
        arr1[2] = "ccc";
        System.out.println(arr1);

        // a list of String elements
        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        System.out.println(list1);

    }
}
