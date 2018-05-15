package testing.module;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorMultiplyTest {

    Calculator calc;

    private int inputIn1;
    private int inputIn2;
    private int inputEx;

    public CalculatorMultiplyTest(int inputIn1, int inputIn2, int inputEx) {
        this.inputIn1 = inputIn1;
        this.inputIn2 = inputIn2;
        this.inputEx = inputEx;
    }

    @Parameterized.Parameters
    public static Collection<Object []> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0}, {0, 1, 0}, {1, 0, 0}, {1, 1, 1},
                {1, 2, 2}, {2, 1, 2}, {2, 2, 4}, {2, 0, 0}, {0, 2, 0},
                {3, 3, 9}, {3, 2, 6}, {2, 3, 6}, {3, 1, 3}, {1, 3, 3}, {0, 3, 0}, {3, 0, 0}
        });
    }

    @Before
    public void makeCalc() {
        calc = new Calculator();
    }

    @Test
    public void testCalculatorMultiply() {
        assertEquals(inputEx, calc.multiply(inputIn1, inputIn2));
    }
}