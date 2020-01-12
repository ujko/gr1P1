package day1.enumy;

public class Main {
    public static void main(String[] args) {

        Kolor red = Kolor.RED;
        red.wypisz();

        //nie da rady
//        Kolor green = new Kolor();

//        Kolor.GREEN.wypisz();
//        new Main().wypiszKolor(Kolor.BLUE);
//        System.out.println(Kolor.BLACK);
//        System.out.println(Kolor2.BLUE);
    }

    private void wypiszKolor(Kolor kolor) {
        System.out.println("Czerwony " + kolor.getRed());
        System.out.println("Zielony " + kolor.getGreen());
        System.out.println("Niebieski " + kolor.getBlue());
    }
}
