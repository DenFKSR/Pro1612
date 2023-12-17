package laba3.task4;

public class Tree {
    //возраст, живое ли дерево и название дерева
private int age;
private boolean statusOfLife;
private String nameOfTree;
    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
        System.out.println("");
    }
    public Tree(int age, String name){
        this.age = age;
        this.nameOfTree = name;
        System.out.println("Название дерева: "+this.nameOfTree);
        System.out.println("Возраст дерева: "+this.age);
        System.out.println("");

    }
    public Tree(int age, String name, boolean status){
        this.age = age;
        this.nameOfTree = name;
        this.statusOfLife = status;
        System.out.println("Название дерева: "+this.nameOfTree);
        System.out.println("Возраст дерева: "+this.age);
        if (statusOfLife == true){
            System.out.println("Состояние дерева: живое");
        }else System.out.println("Состояние дерева: неживое");
        System.out.println("");
    }

}
