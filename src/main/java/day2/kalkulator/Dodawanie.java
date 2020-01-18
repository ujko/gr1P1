package day2.kalkulator;

import java.math.BigDecimal;

public class Dodawanie<T extends Number> {

    T liczbaJeden;
    T liczbaDwa;

    public Dodawanie(T liczbaJeden, T liczbaDwa) {
        this.liczbaJeden = liczbaJeden;
        this.liczbaDwa = liczbaDwa;
    }

    public T dodawanie() {
        if (liczbaJeden instanceof Integer) {
            Integer a = (Integer) liczbaJeden;
            Integer b = (Integer) liczbaDwa;
            Integer sum = a + b;
            return (T) sum;
        }
        if (liczbaJeden instanceof Double) {
            Double a = (Double) liczbaJeden;
            Double b = (Double) liczbaDwa;
            Double sum = a + b;
            return (T) sum;
        }
        if (liczbaJeden instanceof BigDecimal) {
            BigDecimal a = (BigDecimal) liczbaJeden;
            BigDecimal b = (BigDecimal) liczbaDwa;
            BigDecimal sum = a.add(b);
            return (T) sum;
        } throw new IllegalArgumentException("podano nieobslugiwany argument") ;

    }
}
