package day2.zadanieDwa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class Powtorzenia {
    public static void main(String[] args) {
        System.out.println(wyszukajLiczbe(List.of(2, 4, 7, 3, 8, 1, 1)));
        System.out.println(wyszukajPowtorzenie(List.of(1,3, 7, 3, 8, 1 )));
    }

    private static int wyszukajLiczbe(List<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            for (int j = i+1; j <list.size(); j++){
                if (list.get(i).equals(list.get(j))){
                    return list.get(i);
                }
            }
        }
        return -1;
    }

    private static int wyszukajPowtorzenie (List<Integer> list2){

        Set<Integer> set = new HashSet<>();
        for (Integer e: list2){
            int before = set.size();
            set.add(e);
            int after = set.size();
            if (before==after){
                return e;
            }
        }return -1;
    }
}
