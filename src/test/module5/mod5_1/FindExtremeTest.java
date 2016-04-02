package test.module5.mod5_1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import vasylchenko.module5.mod5_1.FindExtreme;


public class FindExtremeTest {

    private static final int[] intArray = {5,20,-100,150,31,87,198};
    FindExtreme findExtreme;

    @Before
    public void setUp() throws Exception {
        findExtreme = new FindExtreme();
    }

    @Test (timeout = 100)
    public void testMaxExtreme() throws Exception {
        int expected = 198;
        Assert.assertEquals(expected,findExtreme.maxExtreme(intArray));
    }

    @Test (timeout = 100)
    public void testMinExtreme() throws Exception {
        int expected = -100;
        Assert.assertEquals(expected,findExtreme.minExtreme(intArray));
    }
}