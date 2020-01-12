package day1.interfejsy;

public class Fiat implements Samochod {
    private String name = "Fiat";

    @Override
    public void wypisz() {
        System.out.println("fiat " + name);
    }
}
