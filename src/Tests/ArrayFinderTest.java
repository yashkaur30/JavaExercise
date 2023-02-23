package Tests;

import aon.arrays.ArrayFinder;
import junit.framework.TestCase;

public class ArrayFinderTest extends TestCase {
    private ArrayFinder arrayFinder = new ArrayFinder();

    public void testFindArray_IfDoesNotExits(){
        int[] largeArray = {4,7,2,0,5,1};
        int[] subArray = {8,9,10};

        int expected = -1;
        int actual = arrayFinder.findArray(largeArray, subArray);

        assertEquals(expected, actual);
    }

    public void testFindArray_IfExists() {

        int[] largeArray = {1,2,3,4,5,6,7};
        int[] subArray = {3,4,5};

        int expected = 2;
        int actual = arrayFinder.findArray(largeArray, subArray);

        assertEquals(expected, actual);
    }

    public void testFindArray_ButSubArray_IsEmpty() {

        int[] largeArray = {5,8,2,9};
        int[] subArray = {};

        int expected = -1;
        int actual = arrayFinder.findArray(largeArray, subArray);

        assertEquals(expected, actual);
    }

    public void testFindArray_SubArray_isLarger_ThanArray() {

        int[] largeArray = {1,2,3,4,5,6,7};
        int[] subArray = {4,5,6,7,8,9,10,11};

        int expected = -1;
        int actual = arrayFinder.findArray(largeArray, subArray);

        assertEquals(expected, actual);
    }

    public void testFindArray_PartiallyEqual() {

        int[] largeArray = {1,2,3,4,5,6,7};
        int[] subArray = {6,7,8};

        int expected = -1;
        int actual = arrayFinder.findArray(largeArray, subArray);

        assertEquals(expected, actual);
    }
}
