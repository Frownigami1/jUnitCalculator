package testing.module;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class CalculatorExistsTest {

    Calculator calc;

    @Before
    public void makeCalc() {
        calc = new Calculator();
    }

    @Test
    public void testCalculatorExists() {
        assertNotNull(calc);
    }
}