package by.home.task.eight;

import org.junit.Assert;
import org.junit.Test;

public class FunctionPerformerTest {

    @Test
    public void doFirstFunctionTest() {
        double number = 200;
        double expected = (-(number*number)+(3*number)+9);
        double actual = FunctionPerformer.doFirstFunction(number);
        Assert.assertEquals(expected, actual ,0.01);
    }
    @Test
    public void doSecondFunctionTest() {
        double number = 0;
        double expected = 1/((number*number*number) - 6);
        double actual = FunctionPerformer.doSecondFunction(number);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
