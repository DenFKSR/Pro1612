package laba4.part2;

import laba4.part1.Task5;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.sortArray(new int[]{10, 25, 38, 40, 52});
        Task2 task2 = new Task2();
        task2.enterTheNumbers();
        Task3 task3 = new Task3();
        task3.replace(new int[]{1, 2, 3, 4, 5});
        Task4 task4 = new Task4();
        task4.searchNumber(new int[]{1, 2, 3, 4, 1, 2, 3, 5});
    }

}
