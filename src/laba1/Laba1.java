package laba1;

import java.util.Scanner;

public class Laba1 {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
    }

    public static void Task1() {
        System.out.println("Задание 1");
        System.out.println("Я\nхорошо \nзнаю \nJava\n");
    }

    public static void Task2() {
        System.out.println("Задание 2");
        System.out.println((46 + 10) * ((double)10 / 3));
        System.out.println((29) * (4) * (-15) + "\n");
    }

    public static void Task3() {
        System.out.println("Задание 3");
        int number = 10500;
        double result = ((number / 10) / 10);
        System.out.println(result + "\n");
    }

    public static void Task4() {
        System.out.println("Задание 4");
        double result1 = 3.6 * 4.1 * 5.9;
        System.out.println(result1 + "\n");
    }

    public static void Task5() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число:");
        System.out.println("Для выхода введите 0:");
        int number1 = s.nextInt();
        System.out.println(number1 + "\n");
    }

    public static void Task6() {
        System.out.println("Задание 6\n Введите число:");
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }
}
