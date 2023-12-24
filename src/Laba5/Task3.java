package Laba5;

public class Task3 {
    private String text;

    public Task3(String text) {
        this.text = text;
    }
    public void searchWord(){
        System.out.println("");
        System.out.println("Задание №3");
        String value = text.replace("бяка", "[вырезано цензурой]");
        System.out.println(value);
    }
}
