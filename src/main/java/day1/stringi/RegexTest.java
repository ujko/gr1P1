package day1.stringi;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {
        String person = "Adam Nowak 99-300 Kielce";
        Pattern pattern =
                Pattern.compile("([A-Z]{1}[a-z]+)" +
                        "\\s([A-Z]{1}[a-z]+)" +
                        "\\s([\\d]{2}-[\\d]{3})" +
                        "\\s([A-Z]{1}[a-z]+)");
        Matcher matcher = pattern.matcher(person);
        try(PrintWriter writer = new PrintWriter("test.txt")) {
            if (matcher.find()) {
                writer.println("Imie " + matcher.group(1));
                writer.println("Nazwisko " + matcher.group(2));
                writer.println("Kod " + matcher.group(3));
                writer.println("Miasto " + matcher.group(4));
            }
        }catch (FileNotFoundException e) {
            System.out.println("Nie udało się utworzyć pliku");
        }

//        PrintWriter writer =null;
//        try {
//            writer = new PrintWriter("test.txt");
//            if (matcher.find()) {
//                writer.println("Imie " + matcher.group(1));
//                writer.println("Nazwisko " + matcher.group(2));
//                writer.println("Kod " + matcher.group(3));
//                writer.println("Miasto " + matcher.group(4));
//            }
//        }catch (FileNotFoundException e) {
//            System.out.println("Nie udało się utworzyć pliku");
//        }finally {
//            if(writer != null) {
//                writer.flush();
//                writer.close();
//            }
//        }
    }

}
