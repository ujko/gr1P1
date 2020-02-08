package day6;

public class Kalkulator {
    private static int nwd(int a, int b) {

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    private static String podziel(int a, int b) {
        int c;
        if(a==0){
            return "0";
        }
        if (b == 0) {
            return "Nie dziel przez zero cholero";
        }
        String znak = "";
        if ((a < 0 && b > 0) || (a>0 && b<0)){
            znak="-";
        }
        a = Math.abs(a);
        b = Math.abs(b);
        c = a % b;
        if (b > a) {
            int d;
            d = nwd(c, b);
            return znak + c / d + "/" + b / d;
        }

        if (c != 0) {
            int d;
            d = nwd(c, b);
            return znak + a / b + " " + c / d + "/" + b / d;
        }
        return znak + a / b;
    }

    public static void main(String[] args) {
        //System.out.println(nwd(0,12));
        System.out.println(podziel(1, Integer.MAX_VALUE));
    }
}
