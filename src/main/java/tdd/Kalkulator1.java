package tdd;

public class Kalkulator1 {


    public double divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("Nieprawidlowy dzielnik");
        }
        return a/b;
    }

    public String doSth(String name) {
        return name + ", ";
    }
}
