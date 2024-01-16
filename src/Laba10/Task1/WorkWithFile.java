package Laba10.Task1;

import java.io.*;
import java.util.Scanner;

public class WorkWithFile {
    String separator = File.separator;
    private String newLine;
    public void readFromFile(String nameFile) throws FileNotFoundException {
        String path = separator + "Users" + separator + "Денис" + separator + "IdeaProjects" + separator + "Pro1612" + separator + "src" + separator + "Laba10" + separator + "Task1" + separator + nameFile;
        File file = new File(path);
        Scanner sc1 = new Scanner(file);
        while (sc1.hasNextLine()) {
            System.out.println(sc1.nextLine());
        }
        sc1.close();
  }
    public void writeLine(String newLine, String nameFile) throws FileNotFoundException {
        this.newLine = newLine;
        String path = separator + "Users" + separator + "Денис" + separator + "IdeaProjects" + separator + "Pro1612" + separator + "src" + separator + "Laba10" + separator + "Task1" + separator + nameFile;
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        pw.append(this.newLine);
        pw.close();
    }
    public void addTextFile(String nameFile1,String nameFile2) throws FileNotFoundException {
        String path = separator + "Users" + separator + "Денис" + separator + "IdeaProjects" + separator + "Pro1612" + separator + "src" + separator + "Laba10" + separator + "Task1" + separator + nameFile1;
        String path2 = separator + "Users" + separator + "Денис" + separator + "IdeaProjects" + separator + "Pro1612" + separator + "src" + separator + "Laba10" + separator + "Task1" + separator + nameFile2;
        File file = new File(path2);
        Scanner sc1 = new Scanner(file);
        String text = "\n" +sc1.nextLine();
        try {
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
    public void replaceSymbols(String nameFile) throws FileNotFoundException {
        String path2 = separator + "Users" + separator + "Денис" + separator + "IdeaProjects" + separator + "Pro1612" + separator + "src" + separator + "Laba10" + separator + "Task1" + separator + nameFile;
        File file = new File(path2);
        Scanner sc1 = new Scanner(file);
        String text = sc1.nextLine();
        String s = text.replaceAll("\\pP", "~");
        String s1 = s.replace('~', '$');
        PrintWriter pw = new PrintWriter(file);
        pw.append(s1);
        pw.close();

    }
}
