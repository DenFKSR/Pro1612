package laba4.part2;

import java.util.Arrays;

public class Task4 {
    public void searchNumber(int[] array) {
        int result = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[0] == array[i]) {
                result = i;
            }
        }
        int[] array1 = new int[result];
        for (int j = 0; j < result; j++) {
            array1[j] = array[j];
        }
        System.out.println("array №1: " + Arrays.toString(array1));

        int[] array2 = new int[array.length - result];
        int m = 0;
        while (result < array.length) {
            array2[m++] = array[result++];
        }
        System.out.println("array №2: " + Arrays.toString(array2));
        int a = 0;
        int b = 0;
        while (a<array1.length||b<array2.length){
            if (array1[a]!=array2[b]){
                System.out.println("Первое уникальное число "+array1[a]);
            }
            a++;
            b++;
        }
    }



}
