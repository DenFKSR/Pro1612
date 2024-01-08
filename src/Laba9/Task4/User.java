package Laba9.Task4;

import java.util.*;

public class User {
    private String name;
    Map<String,Integer> users = new LinkedHashMap<>();
    Scanner sc = new Scanner(System.in);
    Scanner controlUser = new Scanner(System.in);
    String[] names = new String[0];
    public User() {
    }
    public void setName() {
        System.out.println("Введите имя игроков через пробел:");
        this.name = sc.nextLine();
        names = name.split(" ");
    }
    public String getName() {
        return name;
    }
    private int getScore(){
        Random r = new Random();
        int x = r.nextInt(10) + 1;
        return x;
    }
    public void createMap(){
        setName();
        for (int i=0; i<names.length;i++){
            users.put(names[i], getScore());
        }
        System.out.println(users);
    }
    public void showInfoUser(){
        System.out.println("Введите имя игрока");
        String nameUser = controlUser.nextLine();
        int point = users.get(nameUser);
        System.out.println("Имя игрока: "+nameUser+" \nКоличество очков игрока "+ point);
    }

}
