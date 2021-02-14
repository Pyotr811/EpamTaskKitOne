package by.home.task.ten;

import org.junit.Assert;
import org.junit.Test;

public class TanPerformerResultTest {

    @Test
    public void getResultTest() {
        int start = 20;
        int end = 300;
        int step = 40;
        String expected = "20 rad.    2,24\n" +
                "60 rad.    0,32\n" +
                "100 rad.    -0,59\n" +
                "140 rad.    -4,96\n" +
                "180 rad.    1,34\n" +
                "220 rad.    0,09\n" +
                "260 rad.    -0,94\n";
        String actual = TanPerformer.getResult(start, end, step);
        Assert.assertEquals(expected, actual);
    }
}
