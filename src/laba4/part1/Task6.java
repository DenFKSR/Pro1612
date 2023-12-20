package laba4.part1;

public class Task6 {
    public void searhFigures(int[] arrayTwo, int target1, int target2) {
        int number = 0;
        boolean result = false;
        for (int i = 0; i < arrayTwo.length; i++) {
            number = arrayTwo[i];
            if (target1==number||target1==number ){
                result = true;
            }

        }System.out.println(result);

    }
}
