package day1.interfejsy;

public class Bmw implements Samochod {
    private String name = "BMW";

    @Override
    public void wypisz() {
        System.out.println("bmw " + name);
    }
}
