package day4.lambda;

@FunctionalInterface
public interface NaszInterfejs {
    void wypisz(String t);

    default void wypisz1() {
        System.out.println("metoda default");
    }
}
