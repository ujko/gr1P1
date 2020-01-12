package day1.interfejsy;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Samochod s = () -> System.out.println("syrenka ") ;
        Samochod b = new Bmw();
        Samochod c = new Fiat();
        List<Samochod> samochody = List.of(s, b,c);
        samochody.forEach(Samochod::wypisz);

//        Samochod s = new Samochod() {
//            @Override
//            public void wypisz(String name) {
//                System.out.println("nie moje " + name);
//            }
//        };
//        s.wypisz("syrenka");
//        s.wypisz2();

    }
}
