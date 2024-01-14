package Laba5;

import java.util.Arrays;

public class Task4 {
    private String mainText;
    private String controlString;



    public void countSameWord(String mainText, String controlString) {
        this.mainText = mainText;
        this.controlString = controlString;
        System.out.println("");
        System.out.println("Задание №4");
        System.out.println("Строка №1: "+mainText);
        System.out.println("Строка №2: "+controlString);
        boolean result = mainText.contains(controlString);
        String[] words = new String[0];
        String s1 = "c1v1";
        if (result == true) {
            String newString = mainText.replace(controlString, s1);
            String s = newString.replaceAll("\\pP", "");
            words = s.split(" ");
        }
        int count = 0;
        for (int i=0; i< words.length; i++){
            if (words[i].equals(s1)){
                count++;
                System.out.println(words[i]);
            }
        }

        System.out.println("Количество совпадений: "+count);

    }
}
