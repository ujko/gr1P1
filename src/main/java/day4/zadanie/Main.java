package day4.zadanie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static List<String> wczytajPlik() throws IOException {
        return Files.lines(Paths.get("persons.csv")).collect(Collectors.toList());
    }

    private static List<Person> getPersonsFromList(List<String> naszaLista){
//        return naszaLista.stream().map(a-> {
//           String[] s = a.split(",");
//           return new Person(Integer.parseInt(s[0]),s[1],s[2],Integer.parseInt(s[3]));
//        }).collect(Collectors.toList());

        return naszaLista.stream()
                .skip(1)
                .map(a-> a.split(","))
                .map( s -> new Person(Integer.parseInt(s[0]),s[1],s[2],Integer.parseInt(s[3])))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) throws IOException {
        List<Person> personList = getPersonsFromList(wczytajPlik());
//        List<String> list = personList.stream()
//                .filter(d->d.getAge()<18)
//                .map(p->p.getFirstName() + " " + p.getLastName())
//                .collect(Collectors.toList());
//        System.out.println(list);

//        boolean test = personList.stream().anyMatch(s -> s.getLastName().equalsIgnoreCase("alam"));
//        System.out.println(test);
//
//        personList.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));

//        Collections.sort(personList);
//
//        personList.forEach(System.out::println);
//
//        List<List<Integer>> myList = List.of(
//                List.of(1,23,4,5,6,74),
//                List.of(12,2,434,45,356,74),
//                List.of(1,23,54,25,62,74),
//                List.of(1,223,54,55,62,724),
//                List.of(1,23,4,45,46,7544)
//        );
//
//
//        myList.stream()
//                .sorted((o1, o2) -> o1.stream().mapToInt(i -> i).sum() - o2.stream().mapToInt(i -> i).sum())
//                .forEach(System.out::println);
        Map<String,Set<Person>> mapaOsob = personList.stream()
                .collect(Collectors.groupingBy(p-> p.getFirstName(), Collectors.toSet()  ));

        for (Entry<String,Set<Person>> e : mapaOsob.entrySet()){
            System.out.println(e.getKey() + ": " + e.getValue());

        }

    }
}
