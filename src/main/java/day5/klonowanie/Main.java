package day5.klonowanie;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        //dziadeks();
        dziadekKlone();
        //klonowaniePrzezKonstruktor();
    }

    private static void klonowaniePrzezKonstruktor() {
        Adres adr1 = new Adres();
        adr1.setUlica("Nowa");
        adr1.setNrUlicy(10);
        Dziadek d1 = new Dziadek();
        d1.setName("Ryszard");
        d1.setId(1);
        d1.setAdres(adr1);
        Dziadek d2 = new Dziadek(d1);
        d2.setName("Teodor");
        d2.getAdres().setUlica("Piotrkowska");
        System.out.println(d1);
        System.out.println(d2);
    }

    private static void dziadekKlone() throws CloneNotSupportedException {
        Adres adr1 = new Adres();
        adr1.setUlica("Nowa");
        adr1.setNrUlicy(10);
        Dziadek d1 = new Dziadek();
        d1.setName("Ryszard");
        d1.setId(1);
        d1.setAdres(adr1);
        Dziadek d2 = (Dziadek) d1.clone();
        d2.setName("Teodor");
        d2.getAdres().setUlica("Piotrkowska");
        System.out.println(d1);
        System.out.println(d2);
    }

    private static void dziadeks() throws CloneNotSupportedException {
        Dziadek dziadek = new Dziadek();
        dziadek.setId(1);
        dziadek.setName("Andrzej");

        Dziadek dziadek1 = dziadek;
        dziadek1.setName("Karol");
        System.out.println(dziadek);
        System.out.println(dziadek1);

        Dziadek[] array = {dziadek, dziadek1};
        //Dziadek[] kopia = Arrays.copyOf(array,array.length);
        Dziadek[] kopia = new Dziadek[array.length];
        for(int i = 0; i < array.length; i++){
            kopia[i] = (Dziadek) array[i].clone();
        }
        kopia[1].setName("Wojciech");
        for(Dziadek d : array){
            System.out.println(d);
        }
    }

}
