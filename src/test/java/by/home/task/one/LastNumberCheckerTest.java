package by.home.task.one;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class LastNumberCheckerTest {

    private int number;
    private int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> numberTableValues() {
        return Arrays.asList(new Object[][] {
                {10,0},
                {24,4},
                {231,1},
                {8652,2}
        });
    }

    public LastNumberCheckerTest(int number, int numberLastDigit) {
        this.number = number;
        this.expected = numberLastDigit;
    }

    @Test
    public void lastDigitTest001() {
        long actual;

        actual = LastNumberChecker.getLastDigit(number);

        Assert.assertEquals(expected,actual);
    }

}
