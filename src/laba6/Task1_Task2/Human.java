package laba6.Task1_Task2;

public abstract class Human {
    private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {

        return name;
    }

    public String getSurname() {

        return surname;
    }
public abstract void getInformation();
}
