package test.module4.mod4_1;

import org.junit.BeforeClass;
import org.junit.Test;
import vasylchenko.module4.mod4_1.FigureArea;

import static org.junit.Assert.assertEquals;

public class FigureAreaTest {

    private static FigureArea figureArea;

    @BeforeClass
    public static void setUpClass() throws Exception{
        figureArea = new FigureArea();
    }

    @Test (timeout = 1000)
    public void testCircleArea() throws Exception {
        final double a = 5;
        final double result = figureArea.circleArea(a);
        final double expected = Math.PI*a*a;
        assertEquals(expected,result,0);
    }

    @Test (timeout = 1000)
    public void testRectangleArea() throws Exception {
        final double a = 5;
        final double b = 6;
        final double result = figureArea.rectangleArea(a,b);
        assertEquals(a*b,result,0);
    }

    @Test (timeout = 1000)
    public void testTriangleArea() throws Exception {
        final double a = 5;
        final double b = 6;
        final double c = 7;
        final double p = (a + b + c) / 2;
        final double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        final double result = figureArea.triangleArea(a,b,c);
        assertEquals(area,result,0);
    }
}