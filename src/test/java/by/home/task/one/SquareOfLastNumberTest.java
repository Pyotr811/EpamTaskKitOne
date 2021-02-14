package by.home.task.one;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class SquareOfLastNumberTest {

    private int number;
    private long expected;

    @Parameterized.Parameters
    public static Collection<Object[]> powTablesValues() {
        return Arrays.asList( new Object[][]{
                {2,4},
                {5,25},
                {10,100},
                {11,121},
                {15,225}
        });
    }
    public SquareOfLastNumberTest(int number, long expected) {
        this.number = number;
        this.expected = expected;
    }

    @Test
    public void powNumberTest001() {
        long actual;
        actual = LastNumberChecker.squareOfNumber(number);
        Assert.assertEquals(expected,actual);
    }
}
