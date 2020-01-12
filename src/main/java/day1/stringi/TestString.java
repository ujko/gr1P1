package day1.stringi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestString {

    public static void main(String[] args) throws FileNotFoundException {
        wypiszTabliczkeMnozenia();
//        czytajBrzechwe();
//        String a = "Dom";
//
//        wypiszPoprawione(a);

//        a = a.toLowerCase();
//        a = a.replace('d','a');
//        System.out.println(a);

    }

    private static void wypiszTabliczkeMnozenia() {
        for(int i = 1; i<= 10; i++) {
            for (int j =1; j<= 10; j++) {
                String s = String.format("%4d", (i*j));
                System.out.print(s);
            }
            System.out.println();
        }

        System.out.println(Math.PI);
        System.out.printf("%.3f", Math.PI);
    }

    private static void wypiszPoprawione(String name) {
        System.out.printf("Poprawiony %s string", name);
    }

    private static void czytajBrzechwe() throws FileNotFoundException {
        Scanner s = new Scanner(new File("brzechwa.txt"));
        StringBuilder text = new StringBuilder();
        while (s.hasNext()) {
            text.append(s.nextLine()).append('\n');
        }
        System.out.println(text.toString());
    }
}
