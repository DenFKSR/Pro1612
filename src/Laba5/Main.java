package Laba5;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.findLongWord("Hello world, my name is wwwwwwwwww!");
        Task2 task2 = new Task2();
        task2.checkPalindrome("Анна");
        Task3 task3 = new Task3();
        task3.searchWord("Анна - бяка. И пошла бяка гулять. Куда бяка только не ходила");
        Task4 task4 = new Task4();
        task4.countSameWord("Анна - бяка. И пошла бяка гулять. Куда бяка только не ходила", "бяка");
        Task5 task5 = new Task5();
        task5.reversWords("This is a test string");
    }
}
