package by.home.task.five;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class PerfectNumberCheckerTest {
    private int number;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> numberTableValues() {
        return Arrays.asList(new Object[][]{
                {2,false},
                {6,true},
                {20,false},
                {28,true},
                {134,false},
                {496,true},
                {2345,false},
        });
    }

    public PerfectNumberCheckerTest(int number, boolean expected) {
        this.number = number;
        this.expected = expected;
    }

    @Test
    public void perfectNumberCheckerTest() {
        boolean actual;
        actual = PerfectNumberChecker.isPerfectNumber(number);
        Assert.assertEquals(expected, actual);
    }
}
