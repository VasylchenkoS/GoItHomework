package test.module5.mod5_2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import vasylchenko.module5.mod5_2.ArraySort;

public class ArraySortTest {

    private static final int[] intArray = {5, 20, -100, 150, 31, 87, 198};
    private static int[] expectedSortArray = {-100, 5, 20, 31, 87, 150, 198};
    ArraySort arraySort;

    @Before
    public void setUp() throws Exception {
        arraySort = new ArraySort();
    }

    @Test(timeout = 100)
    public void testSimpleSort() throws Exception {
        Assert.assertArrayEquals(expectedSortArray, arraySort.simpleSort(intArray));
    }

    @Test(timeout = 100)
    public void testBubbleSort() throws Exception {
        Assert.assertArrayEquals(expectedSortArray, arraySort.bubbleSort(intArray));

    }
}