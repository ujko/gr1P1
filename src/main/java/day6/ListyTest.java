package day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        List<String> arrayList=generujListe(10_000_000);
        List<String> linkedList= new LinkedList<>(arrayList);
//        long start = System.currentTimeMillis();
//        arrayList.add(1,"String");
//        long stop= System.currentTimeMillis();
//        System.out.println("ArrayList "+(stop-start));
//        long start1 = System.currentTimeMillis();
//        linkedList.add(1,"String");
//        long stop1= System.currentTimeMillis();
//        System.out.println("LinkedList "+(stop1-start1));
//        long start = System.currentTimeMillis();
//        arrayList.get(5_000_000);
//        long stop= System.currentTimeMillis();
//        System.out.println("ArrayList "+(stop-start));
//        long start1 = System.currentTimeMillis();
//        linkedList.get(5_000_000);
//        long stop1= System.currentTimeMillis();
//        System.out.println("LinkedList "+(stop1-start1));
        long start = System.currentTimeMillis();
        int x=0;
        for (int i=0;i<arrayList.size();i++){
          x=i+x;
        }
        System.out.println(x);
        long stop= System.currentTimeMillis();
        System.out.println();
        System.out.println("ArrayList "+(stop-start));
        long start1 = System.currentTimeMillis();
        x=0;
        for (int i=0;i<linkedList.size();i++){
            x=i+x;
        }
        System.out.println(x);
        long stop1= System.currentTimeMillis();
        System.out.println();
        System.out.println("LinkedList "+(stop1-start1));

    }
    public static List<String> generujListe(int size){
        List<String> list=new ArrayList<>(size);
        for(int i=0;i<size;i++){
            list.add("Pozycja nr. "+i);
        }
        return list;
    }
}
