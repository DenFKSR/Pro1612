package laba4.part1;

public class Task1 {
    public int showNumber(){
        int i =1;
        while (i<100){
            if (i%2!=0){
                System.out.println(i);
            }
            i++;
        }
        return i;
    }
}
