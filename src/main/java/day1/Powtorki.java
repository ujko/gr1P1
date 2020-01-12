package day1;

import java.util.Arrays;

/**
 * to jest klasa testowa
 * komentarz javadoc
 */
public class Powtorki {

    private static int a;

    public static void main(String...args) {
        new Powtorki().metoda1(3);
        a = 5;
//        int a = 5;
//        int[] b = {2,3,4,5};
//        metoda1(a);
//        metoda2(b);
//        System.out.println(a);
//        System.out.println(Arrays.toString(b));

//        System.out.println("Hello " + args[0] + " " + args[1]);
//        new Powtorki();
//        String a = "dom";
//        String b = "dom";
//        String c = new String("dom");
//
//        System.out.println(a == b);
//        System.out.println(a == c);
    }


    private void metoda1(int a) {
        a = 10;
    }

    private static void metoda2(int[] a) {
        a[2] = 10;
    }

}
