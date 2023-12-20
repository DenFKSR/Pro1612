package laba4.part2;

public class Task1 {
    public void sortArray(int[] array) {
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                j++;
            }
        }
        if (j == array.length - 1) {
            System.out.println("OK");
        } else System.out.println("Please, try again");

    }

}

