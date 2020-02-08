package day5.cwiczenia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LicznikRymow {


    public static final String PATTERN = "[\\s,.!:?\\-]+";

    public static void main(String[] args) throws FileNotFoundException {
        //testMethode();
        //checkRime("a", "sssssss");
        //System.out.println(makeKey("test", "sobota"));
        readFile();
        //testSubString();
    }

    private static void readFile() throws FileNotFoundException {
        Map<String, Integer> mapOfRime = new HashMap<>();
        File file = new File("pan-tadeusz.txt");
        if (!file.exists()) {
            System.out.println("Brak pliku!!");
            return;
        }
        Scanner scan = new Scanner(file);
        String tempWord = "";
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(PATTERN);
            if (line.length < 1){
                break;
            }
            String lastWord = line[line.length - 1];
            if (checkRime(lastWord, tempWord)) {
                String key = makeKey(lastWord, tempWord);
                if (mapOfRime.containsKey(key)) {
                    mapOfRime.put(key, mapOfRime.get(key) + 1);
                } else {
                    mapOfRime.put(key, 1);
                }

            }
            tempWord = lastWord;
        }
        for (String map: mapOfRime.keySet()) {
            int value = mapOfRime.get(map);
            if (value > 1){
                System.out.println(map + ": " + value);
            }
        }

    }

    private static void testMethode() {
        String test = "tttt ttt t t t ttt,";
        System.out.println(Arrays.toString(test.split(PATTERN)));
    }

    private static boolean checkRime(String firstWord, String secondWord) {
        try {
            if (firstWord.endsWith(secondWord.substring(secondWord.length() - 3))) {
                return true;
            }
        } catch (StringIndexOutOfBoundsException e) {
            //return false;
            //Normalny przypadek
        }
        return false;
    }

    private static String makeKey(String firstWord, String secondWord) {
/*        String key = "";

       if ((firstWord.compareTo(secondWord) < 0)){
            key = firstWord + "_" + secondWord;
        } else {
            key = secondWord + "_" + firstWord;
        }
        return key;*/
        String key = "%s_%s";
        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();
        //return firstWord.compareTo(secondWord) < 0 ? firstWord + "_" + secondWord : secondWord + "_" + firstWord;
        return firstWord.compareTo(secondWord) < 0 ? String.format(key, firstWord,secondWord) : String.format(key, secondWord, firstWord);
    }

    private static void testSubString(){
        String first = "test";
        System.out.println(first.substring(first.length() - 4));
    }
}
