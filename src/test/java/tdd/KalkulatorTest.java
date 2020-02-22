package tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class KalkulatorTest {

    private Kalkulator kalkulator;

    @BeforeEach
    void setUp() {
        kalkulator = new Kalkulator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("should be 0")
    void add_test01() {
        assertTrue(kalkulator.add(0,0) == 0, "should be 0 + 0 = 0");
    }

    @Test
    @DisplayName("should be 7")
    void add_test02() {
//        assertTrue(kalkulator.add(3,4) == 7, "should be 0 + 0 = 0");
        assertEquals(7, kalkulator.add(3,4), "3 + 4 should be 7");
    }

    @Test
    @Order(1)
    void add_test_03() {
        try {
            kalkulator.add(Integer.MAX_VALUE, 5);
            fail("should be IllegalArgument Excepiton");
        }catch (IllegalArgumentException e) {

        }
    }

    @Test
    void add_test_04() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> kalkulator.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals("za duzo", illegalArgumentException.getMessage());
    }

    @ParameterizedTest(name = "{1} + {2} should be {0}")
    @CsvSource({"10,2,8", "120,40,80", "1300, 100, 1200"})
    @Order(2)
    void add_test05(int res, int a, int b) {
        assertEquals(res, kalkulator.add(a,b));
    }


    @ParameterizedTest
    @ValueSource(strings = {"pawel", "juzek"})
    void doSth_test(String name) {
        assertEquals(name, kalkulator.doSth(name));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void doSth_test1(String name) {
        assertEquals("brak stringu", kalkulator.doSth(name));
    }

    @Test
    void add2_test1() {
        assertEquals(0.3, kalkulator.add(0.1, 0.2), 0.001) ;
    }

}