package testing.module;

import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;

public class CalculatorTest {

    @Test public void testCalculatorExists() {
        Calculator calc = new Calculator();

        assertNotNull(calc);
    }

}