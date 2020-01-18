package day2.streamy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamyExample {

    List<Person> listWithPeople = new ArrayList<>();

    private void init () {
        listWithPeople.add(new Person("Maja","Pszczolka",1,100));
        listWithPeople.add(new Person("Ewa","Truten",2,10));
        listWithPeople.add(new Person("Ola","Osa",3,50));
        listWithPeople.add(new Person("Renata","Komar",4,90));
    }

    public StreamyExample() {
        init();
    }

    private void metoda() {
        Stream<Person> str = listWithPeople
                .stream()
                .filter(t -> t.getName().equalsIgnoreCase("olafff"));
//        System.out.println("To sie wypisze");
//        str.forEach(System.out::println);
//        System.out.println("To sie wywali");
//        str.forEach(System.out::println);
        Optional<Person> p = str.findFirst();
//        if(p.isPresent()) {
//            Person pp = p.get();
            Person pp = p.orElse(new Person("brak", "", -1,-1));
            System.out.println(pp);
//        }

    }

    public static void main(String[] args) {
        StreamyExample example = new StreamyExample();
        example.metoda();
    }
}

