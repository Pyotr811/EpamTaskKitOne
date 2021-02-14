package by.home.task.six;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SecondsDividerTest {
    private int secondsAmount;
    private String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> secondsTablesValue() {
        return Arrays.asList(new Object[][]{
                {123458,"34:17:38."},
                {654239,"181:43:59."},
                {0,"Can not be negative!"},
                {-1,"Can not be negative!"}
        });
    }

    public SecondsDividerTest(int secondsAmount, String expected) {
        this.secondsAmount = secondsAmount;
        this.expected = expected;
    }

    @Test
    public void secondsDividerTest() {
        String actual;
        actual = SecondsDivider.divideSeconds(secondsAmount);
        Assert.assertEquals(expected, actual);
    }

}
