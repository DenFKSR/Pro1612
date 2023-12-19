package laba4.part1;

public class Task2 {
public void showNumbers(){
    int i =1;
    System.out.print("Делится на 3: ");
    while (i<100){
        if (i%3==0){
            System.out.print(i+", ");
        }i++;
    }
    i=1;
    System.out.println("");
    System.out.print("Делится на 5: ");
    while (i<100){
        if (i%5==0){
            System.out.print(i+", ");
        }i++;
    }
    i=1;
    System.out.println("");
    System.out.print("Делится на 3 и 5: ");
    while (i<100){
        if (i%3==0 && i%5==0){
            System.out.print(i+", ");
        }i++;
    }
}
}
