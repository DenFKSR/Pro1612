package Laba9.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Collection1 {
    List<Integer> list1 = new ArrayList<>();

    public void addElement() {
        Random r = new Random();
        int x = 0;
        Random i = new Random();
        int index = 0;
        for (int a = 0; a < 1000000; a++) {
            x = r.nextInt(200) + 1;
            list1.add(x);
        }
        for (int a = 0; a < 100000; a++) {
            index = i.nextInt(99999) + 1;
            list1.get(index);

        }
    }
}
