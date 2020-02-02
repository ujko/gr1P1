package day5.cwiczenia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class CountWords {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> result = countWordsStream(3);
        result.entrySet()
                .stream()
                .sorted((o1,o2) -> o2.getValue()-o1.getValue())
                .limit(5).forEach(System.out::println);

//        System.out.println(result.entrySet());

    }

    private static List<String> readFileToList() throws IOException {
        return Files.lines(Paths.get("pan-tadeusz.txt")).collect(Collectors.toList());
    }


    public static Map<String, Integer> countWordsStream(int charSizeToIgnore) throws IOException {
        List<String> list = readFileToList();
        Map<String, Integer> wordCounter = new HashMap<>();
        List<String> listWithEachWord = list.stream()
                .map(line -> line.split("[\\s,.!:?\\-«;]+"))
                .flatMap(Arrays::stream)
                .filter(string -> string.length() > charSizeToIgnore)
                .collect(Collectors.toList());
        for (String word : listWithEachWord) {
            if (wordCounter.containsKey(word)) {
                wordCounter.put(word, wordCounter.get(word) + 1);
            } else {
                wordCounter.put(word, 1);
            }
        }
        return wordCounter;
    }


}

