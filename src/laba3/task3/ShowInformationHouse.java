package laba3.task3;

public class ShowInformationHouse {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setParameters(5, 1995, "ЖК Цветы");
        house1.showParameters();
        house1.countYear(2023);
        House house2 = new House();
        house2.setParameters(17, 2019, "ЖК Подсолнух");
        house2.showParameters("Адрес здания", "Улица Пушкина, дом 5");
        house2.countYear(2023);
    }
}
