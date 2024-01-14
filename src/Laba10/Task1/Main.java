package Laba10.Task1;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        WorkWithFile text1 = new WorkWithFile();
//        text1.writeLine("Привет из первого метода", "text");
//        text1.writeLine("Привет из второго метода!!!!!", "text2");
//        text1.readFromFile("text");
//        text1.readFromFile("text2");
//        text1.addTextFile("text", "text2");
//        text1.readFromFile("text");
//        text1.replaceSymbols("text2");
//        text1.readFromFile("text2");
        TryCatch tryCatch = new TryCatch();
        tryCatch.writeLine("Привет из первого метода", "text");
        tryCatch.writeLine("Привет из второго метода!!!!!", "text2");
        tryCatch.addTextFile("text", "text2");
       //tryCatch.readFromFile("text2");
       tryCatch.readFromFile("text");
        tryCatch.replaceSymbols("text2");
        tryCatch.readFromFile("text2");
    }

}
