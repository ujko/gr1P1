package day5.cwiczenia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PanTadeusz {
    public static String filePath() throws IOException {

        return Files.readString(Paths.get("pan-tadeusz.txt"));
    }
    public static long countWords(String word) throws IOException {
       String list= filePath();
       return Arrays.stream(list.split("[\\s,.!:?]+"))
                .filter(x-> x.toLowerCase().contains(word.toLowerCase())).count();
    }

    public static long countWordsStream(String wordToFind) throws IOException {
        List<String> listWithPanTadeusz = Files.lines(Paths.get("pan-tadeusz.txt"))
                .collect(Collectors.toList());
       return listWithPanTadeusz.stream()
               .map(line->line.split(" "))
               .flatMap(Arrays::stream)
               .filter(word -> word.toLowerCase().contains(wordToFind.toLowerCase()))
               .count();
    }
    public static long countWords2(String word) throws IOException {
        String list = filePath();
        return list.split(word).length-1;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(countWords2("Tadeusz"));
        System.out.println(countWordsStream("Tadeusz"));

    }
}
