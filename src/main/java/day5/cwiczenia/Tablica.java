package day5.cwiczenia;


import java.util.List;

public class Tablica {
    static int a = 1;

    public static void main(String[] args) {

        List<Integer> tab = List.of(1, 2, 3, 6, 6, 7, 8);
        tab.stream().filter(x -> x != a++).findFirst().orElse(0);
        System.out.println(a-1);

    }
}