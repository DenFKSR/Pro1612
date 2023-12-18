package laba3.task2;

public class Car {
    private String name;
    private String color;
    private double weight;
    public Car() {

    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;

    }

    public Car(String name, String color, double weight) {
        this.color = color;
        this.weight = weight;
        this.name = name;
    }
    public void showParameters(){
        if (this.name!=null){
            System.out.println("Параметры автомобиля "+name+":");
        }else System.out.println("Нет информации о названии автомобиля, \nПараметры автомобиля:");
        if (this.color!=null){
            System.out.println("Цвет автомобиля: "+color);
        }else System.out.println("нет информации о цвете автомобиля");
        if (this.weight!=0){
            System.out.println("Вес автомобиля: "+weight);
        }else System.out.println("нет информации о весе автомобиля");
        System.out.println("");
    }

}
