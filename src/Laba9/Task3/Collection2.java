package Laba9.Task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Collection2 {
    List<Integer> list = new LinkedList<>();

    public void addElement() {
        Random r = new Random();
        int x = 0;
        Random i = new Random();
        int index = 0;
        for (int a = 0; a < 1000000; a++) {
            x = r.nextInt(200) + 1;
            list.add(x);
        }
        for (int a = 0; a < 100000; a++) {
            index = i.nextInt(99999) + 1;
            list.get(index);
//            list2.add(index);
//            list3.add(list1.get(index));
        }
    }
}
