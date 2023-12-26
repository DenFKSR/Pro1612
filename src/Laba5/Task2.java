package Laba5;

import java.util.Locale;

public class Task2 {
    private String text;

    public void checkPalindrome(String text){
        this.text = text;
        System.out.println("");
        System.out.println("Задание №2");
        String string = text.toLowerCase(Locale.ROOT);
        boolean answer = false;
        String resultString =  new StringBuilder(string).reverse().toString();
        if (resultString.equals(string)){
            answer = true;
            System.out.println("Слово является палиндромом: "+answer);
        }else System.out.println("Слово является палиндромом: "+answer);
    }
}
