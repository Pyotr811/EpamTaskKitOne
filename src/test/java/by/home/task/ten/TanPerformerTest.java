package by.home.task.ten;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TanPerformerTest {
    private double number;
    private double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> numberTableValues() {
        return Arrays.asList(new Object[][]{
                {0,0.00},
                {30,-6.41},
                {60,0.32},
                {90,-2.00},
                {210,-0.53},
                {240,2.90}
        });
    }

    public TanPerformerTest(double number, double expected) {
        this.number = number;
        this.expected = expected;
    }

    @Test
    public void doFunctionTest001() {
        double actual;
        actual = TanPerformer.doFunction(number);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
