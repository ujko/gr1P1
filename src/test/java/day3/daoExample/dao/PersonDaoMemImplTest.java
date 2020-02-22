package day3.daoExample.dao;

import day3.daoExample.model.Person;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.List;
import java.util.Map;

class PersonDaoMemImplTest {
    private PersonDaoMemImpl personDaoMem;

    @BeforeEach
    void setUp() {
        personDaoMem = new PersonDaoMemImpl();
    }

    @Test
    void getPersonById() {
        Assertions.assertThat(personDaoMem.getPersonById(3).toString())
                .isNotNull()
                .contains("3")
                .contains("NameD");
    }
    @Test
    @DisplayName("when Person id is not present should return id= -1")
    void getPersonById2() {
        Assertions.assertThat(personDaoMem.getPersonById(10))
                .isNotNull().isEqualToComparingOnlyGivenFields(new Person().empty(), "id");
    }

    @DisplayName("should return size = 5")
    @RepeatedTest(3)
    void getPersonByFirstName() {
        Assertions.assertThat(personDaoMem.getPersonByFirstName("Name"))
                .hasSize(5)
                .isInstanceOf(List.class);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void getPersonByFirstName2(String check) {
        Assertions.assertThat(personDaoMem.getPersonByFirstName(check)).isEmpty();
    }

    @Test
    void getPersonByLastName() {
        Assertions.assertThat(personDaoMem.getPersonByLastName("LastName")).hasSize(5);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void getPersonByLastName(String nullOrEmpty) {
        Assertions.assertThat(personDaoMem.getPersonByLastName(nullOrEmpty)).isEmpty();
    }

    @Test
    void getPersonByEmail() {
        Assertions.assertThat(personDaoMem.getPersonByEmail("domain")).hasSize(5);
    }
    @ParameterizedTest
    @NullSource
    void getPersonByEmail(String nullSource) {
        Assertions.assertThatThrownBy(() -> personDaoMem.getPersonByEmail(nullSource))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Email is mandatory");
    }
    @ParameterizedTest
    @EmptySource
    void getPersonByEmail_Test01(String emptySource) {
        Assertions.assertThat(personDaoMem.getPersonByEmail(emptySource).isEmpty());
    }

    @Test
    void getPersonByIp() {
    }

    @Test
    void getAllPersons() {
    }

    @Test
    void addPerson() {
        int size=personDaoMem.personMap.size();
        personDaoMem.addPerson(new Person());
        Assertions.assertThat(personDaoMem.personMap.size()).isEqualTo(size+1);
    }
    @Test
    void addPerson_Test01() {
        personDaoMem.addPerson(new Person().setFirstName("Test"));
        Assertions.assertThat(personDaoMem.personMap.get(6)).isEqualToComparingOnlyGivenFields(new Person().setId(6)
                .setFirstName("Test"), "id", "firstName");
    }
    @ParameterizedTest
    @NullSource
    void addPerson_Test02(Person nullSource) {
        Assertions.assertThatThrownBy(() -> personDaoMem.addPerson(nullSource)).isInstanceOf(IllegalArgumentException.class).hasMessage("Person cannot be null");
    }

    @ParameterizedTest
    @NullSource
    void modifyPerson(Person nullSource) {
        personDaoMem.modifyPerson(nullSource);
    }
    @Test
    void modifyPerson() {
        Person person = new Person().setId(3).setFirstName("Johny").setLastName("Bravo");
        Person person1 = new Person().setId(3).setFirstName("Johny").setLastName("Bravo").setEmail("3domain@com").setGender("FEMALE").setIpAddress("6");
        System.out.println(personDaoMem.personMap.get(3));
        personDaoMem.modifyPerson(person);
        Assertions.assertThat(personDaoMem.personMap.get(3)).isEqualToComparingFieldByField(person1);
    }
    @Test
    void modifyPerson_Test01() {
        int size = personDaoMem.personMap.size();
        Person person = new Person();
        personDaoMem.modifyPerson(person);
        Assertions.assertThat(personDaoMem.personMap.size()).isEqualTo(size);
    }
    @Test
    void modifyPerson_Test02() {
       Map<Integer, Person> expectedMap = personDaoMem.personMap;
       personDaoMem.modifyPerson(new Person());
       Assertions.assertThat(personDaoMem.personMap).isEqualTo(expectedMap);
    }

    @Test
    void removePerson() {
    }
}