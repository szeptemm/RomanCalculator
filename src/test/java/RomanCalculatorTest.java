import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanCalculatorTest {

    @Test
    void shouldIGive1() {
        // given
        RomanCalculator calculator = new RomanCalculator();
        // when
        String roman = "I";
        // then
        assertThat( calculator.roman2Arabic(roman)).isEqualTo(1);
    }
}