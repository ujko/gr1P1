package tdd;

import org.assertj.core.description.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Kalkulator1Test {
    Kalkulator1 kalkulator1;

    @BeforeEach
    void setUp() {
        kalkulator1 = new Kalkulator1();
    }

    @Test
    void divide_test1() {
        assertThat(kalkulator1.divide(2,1)).isEqualTo(2.0);
    }

    @Test
    void divide_test2() {
        assertThatThrownBy(() -> kalkulator1.divide(1,0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Nieprawidlowy dzielnik");
    }

    @Test
    void doSth_test() {
        assertThat(kalkulator1.doSth("dom"))
                .as("jakis string")
                .contains("dom")
                .containsWhitespaces()
                .hasSizeGreaterThan(3);
    }


}