package laba6.Task1_Task2;

public class Client extends Human implements showSomeInfo {
    private String nameBank;
    private  int account;

    public Client(String name, String surname, String nameBank, int account) {
        super(name, surname);
        this.nameBank = nameBank;
        this.account = account;
    }


    @Override
    public void getInformation() {
        System.out.println("");
         System.out.println("Имя клиента: "+ getName());
        System.out.println("Имя клиента: "+  getSurname());
        System.out.println("Название банка: "+nameBank);
        showBankOptions();
    }

    @Override
    public void showBankOptions() {
        System.out.println("дополнительная информация:");
        System.out.println("номер счета: "+account);
    }
}
