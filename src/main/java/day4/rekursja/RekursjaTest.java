package day4.rekursja;

public class RekursjaTest {

    public static void main(String[] args) {
//        System.out.println(sum(4,5));
//        rekursja(5);
//        System.out.println(silnia(10));
        long start = System.currentTimeMillis();
        System.out.println(fibo(30));
        long stop = System.currentTimeMillis();

        fibo2(30);
        long stop1 = System.currentTimeMillis();

        System.out.println(stop - start);
        System.out.println(stop1 - stop);
    }



    public static void fibo2(int a) {
        int sumFibo1 = 0;
        int sumFibo2 = 1;
        int sumFibo = 0;
        for (int i = 1; i < a; i++) {
            sumFibo = sumFibo1 + sumFibo2;
            sumFibo1 = sumFibo2;
            sumFibo2 = sumFibo;

        }
        System.out.println(sumFibo);
    }

    public static int fibo(int a) {
        if (a <= 1) {
            return a;
        }
        return fibo(a - 2) + fibo(a - 1);

    }

    private static long silnia(long a) {
        if (a <= 1) {
            return 1;
        }
        return silnia(a - 1) * a;
    }

    private static void rekursja(int a) {
        if (a == 0) {
            System.out.print(a + ", ");
            return;
        }
        System.out.print(a + ", ");
        rekursja(--a);
        System.out.print(a + ", ");
    }


    private static int sum(int a, int b) {
        if (a == 0) {
            return b;
        }
        return sum(--a, ++b);
    }

}
