package laba4.part1;

import java.util.Arrays;

public class Task5 {
    public void findNumber(int[] arrayOne, int target) {
        boolean compareNumbers = false;
        int number = 0;
        int number1 = 0;
        number = arrayOne[0];
        number1 = arrayOne[arrayOne.length - 1];
        if (number == target && number1 == target) {
            compareNumbers = true;
        }
        System.out.println("Array= " + Arrays.toString(arrayOne));
        System.out.println("Искомое число= " + target);
        System.out.println("Наличие числа: " + compareNumbers);
    }
}
