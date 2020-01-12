package day1.interfejsy;

//@FunctionalInterface
public interface Samochod {
    void wypisz();
    default void wypisz2() {
        System.out.println("Wypisz 2");
    }
}
