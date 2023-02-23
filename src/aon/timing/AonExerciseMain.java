package aon.timing;

import aon.arrays.ArrayFinder;

public class AonExerciseMain {
    public static void main(String[] args) {
        //Return execution time
        new MyIncDec(0).increment();
        new MyIncDec(4).decrement();

        //To find the array inside big array
        int elementIndex = new ArrayFinder().findArray(new int[]{4, 9, 3, 7, 8}, new int []{1,71} );
        if(elementIndex > 0){
            System.out.println("Found array at : " + elementIndex);
        }
        else{
            System.out.println("Array not found ");
        }
    }
}