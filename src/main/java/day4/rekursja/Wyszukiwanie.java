package day4.rekursja;

import day4.zadanie.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wyszukiwanie {
    private static List<String> wczytajPlik() throws IOException {
        return Files.lines(Paths.get("persons.csv")).collect(Collectors.toList());
    }

    private static List<Person> getPersonsFromList(List<String> naszaLista) {
        return naszaLista.stream()
                .skip(1)
                .map(a -> a.split(","))
                .map(s -> new Person(Integer.parseInt(s[0]), s[1], s[2], Integer.parseInt(s[3])))
                .collect(Collectors.toList());
    }

    private static Person getPerson(int personId, List<Person> personList) {
        for (Person e : personList) {
            if (e.getId() == personId) {
                return e;
            }
        }
        return new Person(-1, "", "", -1);
    }

    private static Person getPersonRec(int personId, List<Person> personList) {
       return wyszukaj(personId, personList, 0, personList.size() - 1);

    }

    private static Person wyszukaj(int personId, List<Person> personList, int start, int stop) {
        int middle = (start + stop) / 2;
        Person p = personList.get(middle);
        if (stop<start){
            return new Person(-1, "", "", -1);
//            throw new IllegalArgumentException("Brak ID");
        }
        if (personId == p.getId()) {
            return p;
        }
        if (personId > p.getId()) {
            start = middle + 1;

        } else {
            stop = middle - 1;
        }
        return wyszukaj(personId, personList, start, stop);
    }
//private static Optional<Person> getPerson(int personId, List<Person> personList) {
//    for (Person e : personList) {
//        if (e.getId() == personId) {
//            return  Optional.of(e);
//        }
//    }
//    return Optional.empty();
//}

    public static void main(String[] args) throws IOException {
        List<Person> personList = getPersonsFromList(wczytajPlik());
        long start1 = System.currentTimeMillis();
        System.out.println(getPerson(1200, personList ));
        long stop1 = System.currentTimeMillis();
        //  getPerson(1300, personList).ifPresent(a -> System.out.println(a.getLastName()));
//        Optional<Person> opt = getPerson(12, personList);
//        System.out.println(personList.get(157));
//        personList.remove(157);
        System.out.println(stop1-start1);
        try {
            long start2 = System.currentTimeMillis();
            System.out.println(getPersonRec(1200, personList));
            long stop2 = System.currentTimeMillis();
            System.out.println(stop2-start2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }




    }
}
