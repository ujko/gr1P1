package day1.dziedziczenieKonkret;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Ksztalt kolo = new Kolo();
        kolo.setA(4);

        Ksztalt prostokat = new Prostokat();
        prostokat.setA(4);
        prostokat.setB(8);

        Ksztalt trojkat = new Trojkat();
        trojkat.setA(4);
        trojkat.setB(3);

        Ksztalt kwadrat = new Ksztalt("kwadrat") {
            @Override
            public double pobierzPole() {
                return a * a;
            }

            @Override
            public void setA(int a) {
                super.setA(a * 2);
            }
        };

        kwadrat.setA(8);

        double pole = 0.0;

        List<Ksztalt> ksztalty = List.of(kolo, prostokat, trojkat, kwadrat);
        for(Ksztalt k : ksztalty) {
            System.out.println(k.pobierzPole() + ", " + k.getNazwa());
            pole += k.pobierzPole();
        }

        System.out.println(pole);
    }
}
