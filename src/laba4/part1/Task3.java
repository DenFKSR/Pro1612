package laba4.part1;

import java.util.Scanner;

public class Task3 {
    public boolean compareNumber(){
        System.out.println("");
        boolean result;
        System.out.println("Введите первое число:");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        System.out.println("Введите второе число:");
        Scanner s2 = new Scanner(System.in);
        int b = s2.nextInt();
        System.out.println("Введите третье число:");
        Scanner s3 = new Scanner(System.in);
        int c = s3.nextInt();
        result = a+b==c;
        System.out.println("Результат: "+result);
        return result;
    }
}
