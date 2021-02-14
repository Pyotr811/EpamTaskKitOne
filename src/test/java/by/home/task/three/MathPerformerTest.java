package by.home.task.three;

import org.junit.Assert;
import org.junit.Test;

public class MathPerformerTest {

    @Test
    public void getSideFromAreaTest() {
        double area = 225;
        double expected = 15;
        double actual = MathPerformer.getSideFromArea(area);
        Assert.assertEquals(expected,actual,0.01);

    }

    @Test
    public void squareFromDiagonal() {
        double diagonal = -10;
        double expected = 50;
        double actual = MathPerformer.squareFromDiagonal(diagonal);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void differenceOfSquare() {
        double squareBig = 100;
        double squareSmall = 20.5;
        double expected = squareBig/squareSmall;
        double actual = MathPerformer.differenceOfSquare(squareBig, squareSmall);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
