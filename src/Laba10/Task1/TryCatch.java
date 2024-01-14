package Laba10.Task1;

import java.io.*;
import java.util.Scanner;

public class TryCatch {
    String separator = File.separator;
    private String newLine;
    public void readFromFile(String nameFile) throws FileNotFoundException {
        String path = separator + "Users" + separator + "Денис" + separator + "IdeaProjects" + separator + "Pro1612" + separator + "src" + separator + "Laba10" + separator + "Task1" + separator + nameFile;
        try(BufferedReader scanText= new BufferedReader(new FileReader(path))){
            for (String line; (line = scanText.readLine()) != null; ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeLine(String newLine, String nameFile)  {
        this.newLine = newLine;
        String path = separator + "Users" + separator + "Денис" + separator + "IdeaProjects" + separator + "Pro1612" + separator + "src" + separator + "Laba10" + separator + "Task1" + separator + nameFile;
        try(PrintWriter pw = new PrintWriter(new File(path))){
            pw.append(this.newLine);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void addTextFile(String nameFile1,String nameFile2) {
        String path = separator + "Users" + separator + "Денис" + separator + "IdeaProjects" + separator + "Pro1612" + separator + "src" + separator + "Laba10" + separator + "Task1" + separator + nameFile1;
        String path2 = separator + "Users" + separator + "Денис" + separator + "IdeaProjects" + separator + "Pro1612" + separator + "src" + separator + "Laba10" + separator + "Task1" + separator + nameFile2;
        String text = null;
        try(BufferedReader sc1 = new BufferedReader(new FileReader(path2)); BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(path, true));) {
            for (String line; (line = sc1.readLine()) != null; ) {
                bufferWriter.newLine();
                bufferWriter.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void replaceSymbols(String nameFile) {
        String path2 = separator + "Users" + separator + "Денис" + separator + "IdeaProjects" + separator + "Pro1612" + separator + "src" + separator + "Laba10" + separator + "Task1" + separator + nameFile;
        File file = new File(path2);
        try(Scanner sc1 = new Scanner(file)) {
            String text = sc1.nextLine();
            String s = text.replaceAll("\\pP", "~");
            String s1 = s.replace('~', '$');
            PrintWriter pw = new PrintWriter(file);
            pw.append(s1);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
