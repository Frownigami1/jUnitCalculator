package testing.module;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.fail;

@RunWith(Parameterized.class)
public class CalculatorDivideTest {

    Calculator calc;

    private int inputIn1;
    private int inputIn2;
    private int inputEx;

    public CalculatorDivideTest(int inputIn1, int inputIn2, int inputEx) {
        this.inputIn1 = inputIn1;
        this.inputIn2 = inputIn2;
        this.inputEx = inputEx;
    }

    @Parameterized.Parameters
    public static Collection<Object []> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, 0}, {0, 1, 0}, {1, 0, 0}, {1, 1, 1},
                {1, 2, 0}, {2, 1, 2}, {2, 2, 1}, {2, 0, 0}, {0, 2, 0},
                {3, 3, 1}, {3, 2, 1}, {2, 3, 0}, {3, 1, 3}, {1, 3, 0}, {0, 3, 0}, {3, 0, 0}
        });
    }

    @Before
    public void makeCalc() {
        calc = new Calculator();
    }

    @Test
    public void testCalculatorDivide() {
        try {
            assertEquals(inputEx, calc.divide(inputIn1, inputIn2));
        } catch(ArithmeticException e) {
            assertEquals(e.getMessage(), "/ by zero");
        }
    }
}