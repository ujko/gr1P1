package day6;

import day3.daoExample.model.Person;

import java.io.*;
import java.util.List;

public class ZapisywanieObiektow {
    private static final  File FILE = new File("person.obj");

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person personOne = new Person()
                .setFirstName("Ania")
                .setLastName("Kowalska")
                .setGender("Female")
                .setId(1)
                .setEmail("ak@domain.com")
                .setIpAddress("localhost");
        Person personTow = new Person()
                .setFirstName("Asia")
                .setLastName("Kowalska")
                .setGender("Female")
                .setId(1)
                .setEmail("ak@domain.com")
                .setIpAddress("localhost");
        Person personThree = new Person()
                .setFirstName("ola")
                .setLastName("Kowalska")
                .setGender("Female")
                .setId(1)
                .setEmail("ak@domain.com")
                .setIpAddress("localhost");


        List<Person> listWithPerson = List.of(personOne,personTow,personThree);
//        saveObjectToFile(List.of(personOne,personTow,personThree));
        saveObjectToFile(listWithPerson);
//        Person person = readObjectFromFile();
//        System.out.println(person);
    }
    private static <T> void saveObjectToFile(T t) throws IOException {
        OutputStream outputStream = new FileOutputStream(FILE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(t);
        objectOutputStream.flush();
        objectOutputStream.close();
        outputStream.close();
    }

    static <T extends Serializable> T readObjectFromFile() throws IOException, ClassNotFoundException {
        InputStream inputStream = new FileInputStream(FILE);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        T obj = (T) objectInputStream.readObject();
        objectInputStream.close();
        inputStream.close();
        return obj;
    }
//
//    static void writeObjToFileNio(Person personList) throws IOException {
//        Files.write(Paths.get("person2.obj"));
//    }


}
