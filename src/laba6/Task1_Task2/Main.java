package laba6.Task1_Task2;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Andrey", "Petrov", "SPB-Bank", 12345);
        client1.getInformation();
        BankWorker bankWorker1 = new BankWorker("Ivan", "Kozlov", "Alfa-bank", "cashier", "count money");
        bankWorker1.getInformation();
    }

}
