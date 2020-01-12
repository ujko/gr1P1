package day1.exceptions;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Ksztalt kolo = new Ksztalt("kolo");
        kolo.setA(4);

        Ksztalt prostokat = new Ksztalt("prostokąt");
        prostokat.setA(4);
        prostokat.setB(8);

        Ksztalt trojkat = new Ksztalt("trojkat");
        trojkat.setA(4);
        trojkat.setB(3);

        double pole = 0.0;

        List<Ksztalt> ksztalty = List.of(kolo, prostokat, trojkat);
        for(Ksztalt k : ksztalty) {
            try {
                System.out.println(k.pobierzPole());
                pole += k.pobierzPole();
            }catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }

        System.out.println(pole);
    }
}
