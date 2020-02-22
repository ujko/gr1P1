package day3.daoExample.dao;

import day3.daoExample.model.Person;
import day3.daoExample.utils.CsvUtils;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class PersonDaoMemImpl implements PersonDao {

    Map<Integer, Person> personMap;

    public PersonDaoMemImpl() {
        initializePersonMap(5);
    }

    private void initializePersonMap(int range) {
        personMap = new HashMap<>();
        for (int i = 1; i <= range; i++) {
            personMap.put(i, generatePerson(i));
        }
    }

    private Person generatePerson(int number) {
        return new Person()
                .setId(number)
                .setIpAddress(String.valueOf(number * 2))
                .setGender("FEMALE")
                .setEmail(number + "domain@com")
                .setFirstName("Name" + (char) (number + 65))
                .setLastName("LastName" + (char) (number + 65));
    }


    @Override
    public Person getPersonById(int personId) {
        Person result = personMap.get(personId);
        return result == null ? new Person().empty() : result;
    }

    @Override
    public List<Person> getPersonByFirstName(String firstName) {
        if (firstName == null || firstName.isBlank()) {
            return Collections.EMPTY_LIST;
        }
        return getAllPersons()
                .stream()
                .filter(person -> person.getFirstName().toLowerCase().contains(firstName.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> getPersonByLastName(String lastName) {
        if (lastName == null || lastName.isBlank()) {
            return Collections.EMPTY_LIST;
        }
        return getAllPersons()
                .stream()
                .filter(person -> person.getLastName().toLowerCase().contains(lastName.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> getPersonByEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email is mandatory");
        }
        return getAllPersons()
                .stream()
                .filter(person -> person.getEmail().toLowerCase().contains(email.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> getPersonByIp(String ip) {
        return getAllPersons()
                .stream()
                .filter(person -> person.getIpAddress().toLowerCase().contains(ip.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> getAllPersons() {
        return new ArrayList<>(personMap.values());
    }

    @Override
    public void addPerson(Person person) {
        if(person == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        person.setId(generateID());
        personMap.put(person.getId(), person);
//        CsvUtils.saveToFile(getAllPersons());
    }

    private int generateID() {
        Set<Integer> set = new TreeSet<>(personMap.keySet());
        int i = 1;
        for (int id : set) {
            if (id != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    @Override
    public void modifyPerson(Person person) {
        if (person == null){
            return;
        }
        Person tmp = personMap.get(person.getId());
        if (tmp == null) {
            return;
        }
        if (person.getFirstName() != null) {
            tmp.setFirstName(person.getFirstName());
        }
        if (person.getLastName() != null) {
            tmp.setLastName(person.getLastName());
        }
        if (person.getEmail() != null) {
            tmp.setEmail(person.getEmail());
        }
        if (person.getGender() != null) {
            tmp.setGender(person.getGender());
        }
        if (person.getIpAddress() != null) {
            tmp.setIpAddress(person.getIpAddress());
        }
//        CsvUtils.saveToFile(getAllPersons());
    }

    @Override
    public void removePerson(int personId) {
        personMap.remove(personId);
//        CsvUtils.saveToFile(getAllPersons());
    }
}
