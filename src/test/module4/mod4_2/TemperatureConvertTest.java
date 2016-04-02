package test.module4.mod4_2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import vasylchenko.module4.mod4_2.TemperatureConvert;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class TemperatureConvertTest {

    private static final double x = 0.55555555;
    private double tempValue;
    private double expected;
    private double tempValue2;
    private double expected2;
    public TemperatureConvertTest(double tempValue, double expected, double tempValue2, double expected2) {
        this.tempValue = tempValue;
        this.expected = expected;
        this.tempValue2 = tempValue2;
        this.expected2 = expected2;
    }

    @Parameterized.Parameters(name = "{index}: {1}=(5/9) * ({0} - 32)\t" +
                                     "{index}: {3}={2} * 1.8 + 32")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
                {0,x * (0 - 32),10, 10 * 1.8 + 32},
                {155,x * (155 - 32),0, 0 * 1.8 + 32},
        });
    }

    @Test (timeout = 100)
    public void testConvert(){
        Assert.assertEquals(expected, new TemperatureConvert().toCelsius(tempValue),0.01);
        Assert.assertEquals(expected2, new TemperatureConvert().toFahrenheit(tempValue2),0.01);
    }


}