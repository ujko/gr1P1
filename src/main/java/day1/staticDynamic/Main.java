package day1.staticDynamic;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person();
        p.setName("Adam");
        p.setAge(25);
        Person.programName = " sda 25";
        Person.wypiszCos();
        p1.setName("Ania");
        p1.setAge(34);
        Person.programName = " ads";
        System.out.println(p);
        System.out.println(p1);
    }
}
