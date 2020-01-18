package day2.kalkulator;

import java.math.BigDecimal;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Dodawanie<Integer> test = new Dodawanie(10,10);
        Dodawanie<Double> test2 = new Dodawanie(-10.0,10.5);
        Dodawanie<BigDecimal> test3 = new Dodawanie(new BigDecimal("6000"), new BigDecimal("-6000"));
        System.out.println(test.dodawanie());
        System.out.println(test2.dodawanie());
        System.out.println(test3.dodawanie());


    }
}
