package by.home.task.two;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class CheckDateTest {

    private int year;
    private int monthNumber;
    private String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> dateTableValues() {
        return Arrays.asList(new Object[][]{
                {2010,4,"In April of 2010 year is 30 days!"},
                {1623,10,"In October of 1623 year is 31 days!"},
                {2000,2,"In February of 2000 year is 29 days!"},
                {1200,2,"In February of 1200 year is 29 days!"}
        });
    }
    public CheckDateTest(int year, int monthNumber, String expected) {
        this.year = year;
        this.monthNumber = monthNumber;
        this.expected = expected;
    }

    @Test
    public void checkDateTest001() {
        String actual;
        actual = DateChecker.checkDate(year,monthNumber);
        Assert.assertEquals(expected,actual);
    }


}
