package day5.klonowanie;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = List.of("a","b");
        List<String> list1 = new ArrayList<>(list);
        list1.add("c");
        list1.set(0,"c");
        System.out.println(list);
        System.out.println(list1);
//        String d = "dom";
//        d = d.replace("o", "a");
//        System.out.println(d);
    }
}
