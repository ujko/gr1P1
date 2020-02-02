package day4.zadanie;

public class Zadanie2 {

    public static int method(String z) {
        z = z.substring(0, z.lastIndexOf('1'));
        String[] zeroTab = z.split("1");
        int max = 0;
        for (String s : zeroTab) {
            int size = s.length();
            if (size > max) {
                max = size;
            }
        }
        return max;
    }

    public static String binary(int a) {
        StringBuilder b = new StringBuilder();
        while (a > 0) {
            b.append(a % 2);
            a /= 2;
        }
        return b.reverse().toString();
    }

//    public static String binary(int a) {
//        String b="";
//        while (a > 0) {
//           b = a%2 + b;
//           a /= 2;
//        }
//        return b;
//    }

    public static void main(String[] args) {
        String s = binary(8);
        System.out.println(method("100000001000100001"));
    }

}
