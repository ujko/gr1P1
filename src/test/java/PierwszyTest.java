import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PierwszyTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Przygotowanie przed wszystkimi testami");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Zakończenie wszystkich testów");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Przygotowanie testu");
    }

    @AfterEach
    void after() {
        System.out.println("Zakończenie testu");
    }

    @Test
    void test() {
        System.out.println("To jest test metody test");
    }

    @Test
    void test1() {
        System.out.println("To jest test metody test1");
    }

    @Test
    @Tag("fast")
    void test2() {
        System.out.println("To jest test metody test2 szybki");
    }

    @Test
    void test3() {
        System.out.println("To jest test metody test3");
    }

    @Test
    void test4() {
        System.out.println("To jest test metody test4");
    }

    @Test
    @Tag("fast")
    void test5() {
        System.out.println("To jest test metody test5 szybki");
    }

    @Test
    void test6() {
        assertAll(
                () -> assertEquals(2,2),
                () -> assertEquals(7,7)
        );
    }



    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    class jakies_inne_testy_dotyczace_aplikacji {
        @Test
        void test1() {
            System.out.println("Wewnetrzny test");
        }
    }
}
