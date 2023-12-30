package laba6.Task6;

import java.util.Scanner;

public class User {
    Scanner s = new Scanner(System.in);

    public void showInformation(){
        System.out.println("Введите возраст пользователя");
        int b = s.nextInt();
        System.out.println("Возраст пользователя - "+b);
    }
}
