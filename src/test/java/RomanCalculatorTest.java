import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RomanCalculatorTest {

    private RomanCalculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new RomanCalculator();
    }

    @Test
    void shouldIGive1() {
        // when
        String roman = "I";
        // then
        assertThat( calculator.roman2Arabic(roman)).isEqualTo(1);
    }

    @Test
    void shouldIGive2() {
        // when
        String roman = "II";
        // then
        assertThat( calculator.roman2Arabic(roman)).isEqualTo(2);
    }

    @Test
    void shouldIGive3() {
        // when
        String roman = "III";
        // then
        assertThat( calculator.roman2Arabic(roman)).isEqualTo(3);
    }

    @Test
    void shouldIGive5() {
        // when
        String roman = "V";
        // then
        assertThat( calculator.roman2Arabic(roman)).isEqualTo(5);
    }

    @Test
    void shouldIGive4() {
        // when
        String roman = "IV";
        // then
        assertThat( calculator.roman2Arabic(roman)).isEqualTo(4);
    }

    @Test
    void shouldIGive10() {
        // when
        String roman = "X";
        // then
        assertThat( calculator.roman2Arabic(roman)).isEqualTo(10);
    }
}