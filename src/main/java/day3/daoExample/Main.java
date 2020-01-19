package day3.daoExample;

import day3.daoExample.dao.PersonDao;
import day3.daoExample.dao.PersonDaoCsvImpl;
import day3.daoExample.model.Person;
import day3.daoExample.utils.CsvUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
//    static Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    static Logger logger = LoggerFactory.getLogger("Main");
    public static void main(String[] args) throws IOException {
//        Map<Integer, Person> integerPersonMap = CsvUtils.loadCsvFileToMap();
//        List<Person> personList = new ArrayList<>(integerPersonMap.values());
//        CsvUtils.saveToFile(personList);
//        System.out.println(new PersonDaoCsvImpl().generateID());
        PersonDao obj = new PersonDaoCsvImpl();
        List<Person> list = obj.getAllPersons();
        System.out.println(list.size());
        obj.addPerson(new Person()
                .setFirstName("Testowe Imie")
                .setLastName("Testowe Nazwisko")
                .setGender("Female")
                .setIpAddress("127.0.0.1")
                .setEmail("test@test.com"));
        System.out.println(obj.getAllPersons().size());
        obj.removePerson(600);
        System.out.println(obj.getAllPersons().size());
        obj.addPerson(new Person()
                .setFirstName("AAAAAAAAA")
                .setLastName("BBBBBBBBB")
                .setGender("Female")
                .setIpAddress("127.0.0.3")
                .setEmail("test@test.com"));
        System.out.println(obj.getPersonById(600));
        System.out.println(obj.getPersonById(601));
        obj.modifyPerson(new Person()
                .setId(601)
                .setFirstName("XXXXXX"));
        System.out.println(obj.getPersonById(601));
        obj.addPerson(new Person().setFirstName("@"));

    }
}
