package Laba5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    private String text;

    public Task1(String text) {
        this.text = text;
    }

    public void findLongWord() {
        System.out.println("Задание №1");
        System.out.println("Исходный текст: "+ text);
        String s = text.replaceAll("\\pP", "");
        String[] words = s.split(" ");
        int[] array1 = new int[words.length];
        int number = 0;
        for (int i = 0; i < words.length; i++) {
            array1 = new int[]{words[i].length()};
            number = array1[0];
        }

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (number == words[i].length()) {
                count++;
            }
        }
        int j =0;
        String [] result = new String[count];
        for (int i = 0; i < words.length; i++) {
            if (number == words[i].length()) {
                result[j] = words[i];
                j++;
            }
        }System.out.println("Самое длинное слово в тексте: "+Arrays.toString(result));
    }
}