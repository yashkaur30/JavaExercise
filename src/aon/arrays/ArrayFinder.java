package aon.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ArrayFinder {
    public static int findArray(int[] array, int[] subArray) {

        if (subArray.length > array.length) {
            return -1;
        }

        if (array.length == 0 || subArray.length == 0) {
            return -1;
        }

        return Collections.indexOfSubList(Arrays.stream(array).boxed().toList(),
                IntStream.of(subArray).boxed().toList());
    }



}
