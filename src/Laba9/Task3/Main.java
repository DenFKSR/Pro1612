package Laba9.Task3;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Collection1 ar1 = new Collection1();
        ar1.addElement();
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Время выполнения ArrayList "+ elapsed);
        start = System.currentTimeMillis();
        Collection2 ar2 = new Collection2();
        ar2.addElement();
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Время выполнения LinkedList "+elapsed);
        System.out.println("Предположение:");
        System.out.println("Поиск элемента в LinkedList занимает больше время, т.к. это очередь имеющая ссылку на предыдущий и следующий элемент, что как следствие подразумевает больший объем обработки данных.");
    }
}
