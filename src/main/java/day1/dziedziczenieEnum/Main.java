package day1.dziedziczenieEnum;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Ksztalt kolo = new Ksztalt(Shape.KOLO);
        kolo.setA(4);

        Ksztalt prostokat = new Ksztalt(Shape.PROSTOKAT);
        prostokat.setA(4);
        prostokat.setB(8);

        Ksztalt trojkat = new Ksztalt(Shape.TROJKAT);
        trojkat.setA(4);
        trojkat.setB(3);

        double pole = 0.0;

        List<Ksztalt> ksztalty = List.of(kolo, prostokat, trojkat);
        for(Ksztalt k : ksztalty) {
            System.out.println(k.pobierzPole());
            pole += k.pobierzPole();
        }

        System.out.println(pole);
    }
}
