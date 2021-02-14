package by.home.task.seven;

import org.junit.Assert;
import org.junit.Test;

public class CoordinatesTest {

    @Test
    public void getDistanceFromZeroPointTest() {
        int x, y;
        x = 3;
        y = 4;
        double expected = 5 ;
        double actual = Coordinates.getDistanceFromZeroPoint(x, y);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void comparePointsTest() {
        int x1, x2, y1, y2;
        x1 = 5;
        y1 = 4;
        x2 = -3;
        y2 = 4;
        String expected = "First point farther from the coordinates start!";
        //String expected = "Second point farther from the coordinates start!";
      //  String expected = "Points situate at the same distance from coordinates start!";
        String actual = Coordinates.comparePoints(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual);
    }
}
