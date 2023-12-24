package Laba5;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1("Hello world, my name is wwwwwwwwww!");
        task1.findLongWord();
        Task2 task2 = new Task2("Анна");
        task2.checkPalindrome();
        Task3 task3 = new Task3("Анна - бяка. И пошла бяка гулять. Куда бяка только не ходила");
        task3.searchWord();
        Task4 task4 = new Task4("Анна - бяка. И пошла бяка гулять. Куда бяка только не ходила", "бяка");
        task4.countSameWord();
        Task5 task5 = new Task5("This is a test string");
        task5.reversWords();
    }
}
