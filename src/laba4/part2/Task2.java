package laba4.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public int createArray() {
        System.out.println("Введите длину массива");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        return a;
    }

    public void enterTheNumbers() {
        int[] myArray = new int[createArray()];
        System.out.println("Введите содержимое массива");

        for (int i = 0; i < myArray.length; i++) {
            Scanner s2 = new Scanner(System.in);
            int b = s2.nextInt();
            myArray[i] = b;
        }
        System.out.println("Длина массива: " + myArray.length);
        System.out.println("Содержимое массива: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println("Result: " + Arrays.toString(myArray));
    }
}

