package day3.daoExample;

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
        Map<Integer, Person> integerPersonMap = CsvUtils.readCsvFile();
        List<Person> personList = new ArrayList<>(integerPersonMap.values());
        CsvUtils.saveToFile(personList);

    }
}
