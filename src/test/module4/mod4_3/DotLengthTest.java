package test.module4.mod4_3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import vasylchenko.module4.mod4_3.DotLength;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class DotLengthTest {

    private int x1, x2, y1, y2;
    private double expected;

    public DotLengthTest(int x1, int x2, int y1, int y2, double expected) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:{4}=(({1} - {0})^2 + ({3} - {2})^2)^0.5")

    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
                {1, 2, 1, 2, Math.sqrt(2)},
                {1, 4, 1, 4, Math.sqrt(18)},
                {1, 5, 1, 5, Math.sqrt(32)}
        });
    }

    @Test(timeout = 100)
    public void testDotLength() throws Exception {
        Assert.assertEquals(expected, new DotLength().dotLength(x1, y1, x2, y2),0.01);
    }
}