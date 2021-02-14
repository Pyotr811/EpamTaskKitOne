package by.home.task.eight;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ResultViewerTest {
    private double variable;
    private String expected;


    @Parameterized.Parameters
    public static Collection<Object[]> variablesTable() {
        return Arrays.asList(new Object[][]{
                {10,"Result: -61,0000."},
                {0,"Result: -0,1667."},
                {154,"Result: -23245,0000."},
                {-3, "Result: -0,0303."},
                {-124,"Result: -0,0000."}
        });
    }

    public ResultViewerTest(double variable, String expected) {
        this.variable = variable;
        this.expected = expected;
    }

    @Test
    public void getResultTest001() {
        String actual;
        actual = ResultViewer.getResult(variable);
        Assert.assertEquals(expected, actual);
    }
}
