package by.home.task.two;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class InputValuesCheckTest {
    private int year;
    private int month;
    private String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> inputValuesTable() {
        return Arrays.asList(new Object[][]{
                {3000,13,"Wrong number of month!"},
                {3002,10,"Wrong number of year!"},
                {0,5,"Wrong number of year!"},
                {1,-1,"Wrong number of month!"},
                {1500,6,"In June of 1500 year is 30 days!"}
        });
    }

    public InputValuesCheckTest(int year, int month, String expected) {
        this.year = year;
        this.month = month;
        this.expected = expected;
    }

    @Test
    public void inputValuesCheckTest001() {
        String actual = DateChecker.checkInputValues(year,month);
        Assert.assertEquals(expected,actual);
    }
}
