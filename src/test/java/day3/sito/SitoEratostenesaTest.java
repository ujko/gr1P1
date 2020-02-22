package day3.sito;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class SitoEratostenesaTest {

    SitoEratostenesa sitoEratostenesa;
    int length;
    boolean[] table;

    @BeforeEach
    void setUp() {
        sitoEratostenesa = new SitoEratostenesa();
    }

    @Test
    void createTableWithSth_test1() {
        length = 4;
        assertEquals(length, sitoEratostenesa.createTableWithSth(length).length);
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 10, 100, 2000})
    void createTableWithSth_test2(int length) {
        assertEquals(length, sitoEratostenesa.createTableWithSth(length).length);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 10, 100, 2000})
        //@Disabled
    @EnabledOnOs(OS.WINDOWS)
    @EnabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_11)
    void createTableWithSth_test3(int length) {
        Assumptions.assumeTrue(length > 1);
        table = sitoEratostenesa.createTableWithSth(length);
        for (int i = 2; i < table.length; i++) {
            if (!table[i]) {
                fail("Should be true");
            }
        }
    }

    @Test
    void createTableWithSth_test4() {
        length = -2;
        assertThrows(NegativeArraySizeException.class, () -> sitoEratostenesa.createTableWithSth(length));
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    void getSystemProperties() {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }

    @Test
    void getEnvironmentVariables() {
        Map<String, String> map = System.getenv();
        map.forEach((x,y) -> System.out.println(x + " : " + y));
    }

    @Test
    void doSito_test01() {
        boolean[] expectedTable = {false, false, true, true, false, true, false, true, false, false, false};
        boolean[] table = {false, false, true, true, true, true, true, true, true, true, true};
        assertArrayEquals(expectedTable, sitoEratostenesa.doSito(table));
    }


}