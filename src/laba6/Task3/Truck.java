package laba6.Task3;

public class Truck extends Car{
    private int amountOfWheels;
    private int maxWeight;
    public Truck() {
    }
    public Truck(int weight, String model, char color, float speed, int amountOfWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.maxWeight = maxWeight;
        this.amountOfWheels = amountOfWheels;

    }
    public void newWheels(int amountOfWheels){
        this.amountOfWheels = amountOfWheels;
        System.out.println("новое количество колес:"+ amountOfWheels);
    }
    public void outPut(){
        System.out.println("Модель " + model + ", Вес составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Количество колес " + amountOfWheels+ ", Грузоподъемность "+maxWeight + "кг.");
    }

}
