package laba4.part2;

import java.util.Arrays;

public class Task3 {
    public void replace(int[] array1){
        int [] array2 = new int [array1.length];
        array2[0] = array1[array1.length-1];
        for (int i =1; i<array1.length-1; i++){
            array2[i] = array1[i];
        }array2[array1.length-1]= array1[0];
        System.out.println("array №1: " + Arrays.toString(array1));
        System.out.println("array №2: " + Arrays.toString(array2));
    }
}
