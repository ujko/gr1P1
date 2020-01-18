package day2.lambdy;

public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };
        System.out.println(oblicz(6,7,k));

        System.out.println(oblicz(3,4,(x,y) -> x/y));
    }

    private static int oblicz(int a, int b, Kalkulator k) {
        return k.calc(a,b);
    }
}
