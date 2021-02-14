package by.home.task.nine;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class CircleTest {

    @Test
    public void checkCircumferenceTest() {
        double radius = 123;
        double expected = (2*PI*radius);
        double actual = Circle.checkCircumference(radius);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void checkAreaOfCircleTest() {
        double radius = 34;
        double expected = PI*pow(radius,2);
        double actual = Circle.checkAreaOfCircle(radius);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
