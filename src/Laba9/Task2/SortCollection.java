package Laba9.Task2;

import java.util.*;

public class SortCollection {
    List<String> stringCollection = new ArrayList<>();

public void showCollection(List<String> stringCollection){
    System.out.println(stringCollection);
    System.out.println("");
    Set<String> stringSet = new TreeSet<>();
    stringSet.addAll(stringCollection);
    System.out.println(stringSet);
}



}
