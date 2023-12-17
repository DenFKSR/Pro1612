package laba3.task2;

public class showCars {
    public static void main(String[] args) {
        Car car1 = new Car("Blue", 1600);
        car1.showParameters();
        Car car2 = new Car("BMW", "Red", 1700);
        car2.showParameters();
    }
}
