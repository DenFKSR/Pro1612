package Laba5;

import java.util.Arrays;

public class Task5 {
    private String text;

    public void reversWords(String text){
        this.text = text;
        System.out.println("");
        System.out.println("Задание №5");
        System.out.println("Строка №1: "+text);
        String [] strings = text.split(" ");
        String s1=null;
        StringBuilder answer = new StringBuilder();
        StringBuilder result= null;
        for (String word:strings){
            s1 = new StringBuilder(word).reverse().toString();
            result=answer.append(s1+" ");
        }System.out.println("Результат реверса: "+result);


    }


}
