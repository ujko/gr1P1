package tdd;

public class Kalkulator {
    String name = "dom";


    public int add(int a, int b) {
        int c = a + b;
        if(a > 0 && b > 0 && c < 0) {
            throw new IllegalArgumentException("za duzo");
        }
        return c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double divide(int a, int b) {
        return (double) a / (double) b;
    }


    public String doSth(String name) {
        return name == null || "".equals(name) ? "brak stringu" : name;
    }
}
