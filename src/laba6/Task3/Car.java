package laba6.Task3;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;
    public Car() {

    }
    public Car(int w, String m, char c, float s) {
        this.weight = w;
        this.model = m;
        this.color = c;
        this.speed = s;
    }
    public void outPut(){
        System.out.println(" Модель " + model + "Вес составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);

    }
}
