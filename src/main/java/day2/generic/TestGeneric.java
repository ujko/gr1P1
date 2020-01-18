package day2.generic;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("dome");
        String l = (String) list.get(0);
    }
}
