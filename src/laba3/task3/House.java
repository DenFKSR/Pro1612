package laba3.task3;

public class House {
    //поля: количество этажей, год постройки, наименование;
    private int floor;
    private int yearOfBuilding;
    private String nameHouse;

    public void setParameters(int floor, int yearOfBuilding, String nameHouse) {
        this.floor =floor ;
        this.yearOfBuilding = yearOfBuilding;
        this.nameHouse = nameHouse;
    }
    public void showParameters() {
        System.out.println("Наименование жилого комплекса: " +this.nameHouse);
        System.out.println("Года постройки: " +this.yearOfBuilding);
        System.out.println("Количество этажей: " +this.floor);

    }
public int countYear(int year){
        int result =year - yearOfBuilding;
    System.out.println(nameHouse+" - " +" "+result+" лет.");
    return result;
}

    public void showParameters(String newParameter, String value) {
        System.out.println("Наименование жилого комплекса: " +this.nameHouse);
        System.out.println("Года постройки: " +this.yearOfBuilding);
        System.out.println("Количество этажей: " +this.floor);
        System.out.println(newParameter+ ": "+ value);
    }

}
