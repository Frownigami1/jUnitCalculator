package testing.module;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorAddTest {

    Calculator calc;

    private int inputIn1;
    private int inputIn2;
    private int inputEx;

    public CalculatorAddTest(int inputIn1, int inputIn2, int inputEx) {
        this.inputIn1 = inputIn1;
        this.inputIn2 = inputIn2;
        this.inputEx = inputEx;
    }

    @Parameterized.Parameters
    public static Collection<Object []> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0}, {0, 1, 1}, {1, 0, 1}, {1, 1, 2}, {1, 2, 3}, {2, 1, 3}, {2, 2, 4}
        });
    }

    @Before
    public void makeCalc() {
        calc = new Calculator();
    }

    @Test
    public void testCalculatorAdd() {
        assertEquals(inputEx, calc.add(inputIn1, inputIn2));
    }
}