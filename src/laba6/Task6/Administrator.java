package laba6.Task6;

public class Administrator extends User{
    @Override
    public void showInformation() {
        System.out.println("Введите  пользователя:");
        String name = s.nextLine();
        System.out.println("Имя пользователя - "+name);
    }
}
