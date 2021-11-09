package kaydunovdenis;

import com.github.kaydunovdenis.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import javax.script.ScriptException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Kaydunov Denis
 * 09.11.2021
 */
class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
//            "'3 + 45.7 - (12 + 5.6 * -7)', 75.9",
            "'1/0.2', 5.0",
            "'1.0/0.2', 5.0",
            "'0.6/0.2', 3.0"

    })
    void evaluate(String data, String expected) throws ScriptException {
        assertEquals(expected, new Calculator().evaluate(data));
    }
}