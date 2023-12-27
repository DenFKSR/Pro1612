package laba6.Task1_Task2;

public class BankWorker extends Human implements showSomeInfo{
    private String nameBank;
    private String position;
    private String duty;
    public BankWorker(String name, String surname, String nameBank, String position, String duty) {
        super(name, surname);
        this.nameBank = nameBank;
        this.position = position;
        this.duty = duty;
    }


    @Override
    public void getInformation() {
        System.out.println("");
        System.out.println("Имя работника: "+ getName());
        System.out.println("Имя работника: "+  getSurname());
        System.out.println("Название банка: "+nameBank);
        showBankOptions();
    }

    @Override
    public void showBankOptions() {
        System.out.println("дополнительная информация:");
        System.out.println("должность:"+ position);
        System.out.println("обязанности:"+ duty);
    }
}
