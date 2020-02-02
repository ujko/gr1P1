package day5.cwiczenia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PanTadeusz {
    public static List<String> filePath() throws IOException {
        return Files.lines(Paths.get("pan-tadeusz.txt")).collect(Collectors.toList());
    }
    public static long countWords(String word) throws IOException {
       List<String> list= filePath();
       return list.stream()
               .map(line->line.split(" ")).flatMap(x->Stream.of)
               .filter(wor -> wor.equals(word))
               .count();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(countWords("Tadeusz"));
    }
}
