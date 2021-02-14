package by.home.task.four;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class EvenNumberCheckerTest {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> numbersTableValues() {
        return Arrays.asList(new Object[][]{
                {2,3,4,5,2},
                {10,12,11,15,2},
                {21,33,41,57,0},
                {22,37,407,51,1},
                {20,30,40,50,4},
                {22,332,448,523,3},
        });
    }

    public EvenNumberCheckerTest(int num1, int num2, int num3, int num4, int expected) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.expected = expected;
    }

    @Test
    public void evenNumbersCheckerTest001() {
        int actual = EvenNumberChecker.numbersCheck(num1, num2, num3, num4);
        Assert.assertEquals(expected, actual);
    }
}
