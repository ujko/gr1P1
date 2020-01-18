package day2.kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaImion = List.of("Ania", "Ewa", "Alicja", "Basia", "Kasia");
        List<String> newList = new ArrayList<>(listaImion);
//        List<String> newList = new ArrayList<>(List.of("Ania","Ewa","Alicja","Basia","Kasia"));
        Collections.sort(newList);
        System.out.println(newList);
        Collections.sort(newList, (o1, o2) -> o1.length() - o2.length());
//        Collections.sort(newList, Comparator.comparingInt(String::length));
        System.out.println(newList);
        Collections.sort(newList, (o1, o2) -> o2.compareTo(o1));
//        Collections.sort(newList, Comparator.reverseOrder());
        System.out.println(newList);
    }
}
