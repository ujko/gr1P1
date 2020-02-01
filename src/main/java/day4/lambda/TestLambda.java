package day4.lambda;

import java.util.function.Predicate;

public class TestLambda {
    public static void main(String[] args) {
//        NaszInterfejs ns = x -> System.out.println("Test " + x);
//        ns.wypisz("Dom");
//        ns.wypisz1();
        method("House", x -> System.out.println("Test " + x));

    }


//    public static void main(String[] args) {
//        NaszInterfejs ns = new NaszInterfejs() {
//            @Override
//            public void wypisz(String t) {
//                System.out.println("Test " + t);
//            }
//        };
//
//        ns.wypisz("Dom");
//        ns.wypisz1();
//    }


    private static void method(String s, NaszInterfejs ni) {
        ni.wypisz(s);
    }
}
