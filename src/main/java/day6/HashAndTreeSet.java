package day6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HashAndTreeSet {
    public static Set<Integer> generateHashSet(int a){
        Set <Integer> hashSet = new HashSet <>();
        Random r = new Random();
        for (int i = 0; i <a ; i++) {
            hashSet.add(r.nextInt(10000));
        } return hashSet;
    }
    public static Set<Integer> generateTreeSet(int a){
        Set <Integer> treeSet = new TreeSet<>();
        Random r = new Random();
        for (int i = 0; i <a ; i++) {
            treeSet.add(r.nextInt(10000));
        } return treeSet;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        generateHashSet(1_000_000);
        long stop = System.currentTimeMillis();
        System.out.println("HashSet " +(stop - start));

        long start1 = System.currentTimeMillis();
        generateTreeSet(1_000_000);
        long stop1 = System.currentTimeMillis();
        System.out.println("TreeSet " +(stop1 - start1));
    }

}
