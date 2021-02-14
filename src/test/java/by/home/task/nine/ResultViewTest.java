package by.home.task.nine;


import org.junit.Assert;
import org.junit.Test;

public class ResultViewTest {

    @Test
    public void getCircleDataTest() {
        double radius = 30;
        String expected = "Radius of a circle: 30.0,\n" +
                "Circumference: 188,50,\n" +
                "Area of a circle: 2827,43.";
        String actual = ResultViewer.getCircleData(radius);
        Assert.assertEquals(expected, actual);
    }
}
