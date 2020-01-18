package day2.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtils {
private static final String PROPERTY_FILE = "config.prop";

    public static void main(String[] args) {
//        System.out.println(odczytajPlik("brzechwa.txt"));

//        List<String> a = odczytajPlik("brzechwa.txt");
//        a.add("test");
//        a.forEach(System.out::println);
//        zapiszDoPliku("brzechwa1.txt", a);
//        odczytajPlik("brzechwa.txt").forEach(System.out::println);

//        zapiszProperty("key", "jakas wartosc");
//        zapiszProperty("nowy_klucz", "kolejna wartość");
        System.out.println(pobierzProperty("key"));
    }

    public static List<String> odczytajPlik(String plik) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(plik));
        return stream.collect(Collectors.toList());
    }

    public static void zapiszDoPliku(String plik, List<String> list) throws IOException {
        Files.write(Paths.get(plik), list);
    }

    public static void zapiszProperty(String key, String value) {
        Properties properties = getProp();
        properties.put(key, value);
        try(OutputStream os = new FileOutputStream(new File(PROPERTY_FILE))) {
            properties.store(os, "Nasz komentarz");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Properties getProp() {
        Properties properties = new Properties();
        try (InputStream is = new FileInputStream(new File(PROPERTY_FILE)) ){
            properties.load(is);
        } catch (IOException e) {
            System.out.println("Brak pliku");
        }
        return properties;
    }

    public static String pobierzProperty(String key) {
//        Properties properties = new Properties();
//        InputStream is = new FileInputStream(new File(PROPERTY_FILE));
//        properties.load(is);
        String result = getProp().getProperty(key);
        return result != null ? result : "brak property";
    }
}
