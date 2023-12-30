package Laba7;

public class Plane {
    private double weightWing;
    private String name;
    private int born;
    CurrentYear currentYear = new CurrentYear();
    private int year1 = currentYear.showCurrentYear();
    public Plane(String name, double weightWing, int born) {
        this.name = name;
        this.weightWing = weightWing;
        this.born = born;
    }

    private class Wing {
        public void showInfoWing() {
            System.out.println("Крыло весит " + weightWing + " килограмм.");
        }
    }

    private class Name {
        public void howInfoName() {
            System.out.println("Название самолета " + name);
        }
    }

    private class Age {
        public void howInfoAge() {
            System.out.println("Название самолета " + name);
        }
    }

    private class CountAge {
        public void showAge() {
            int age = year1 - born;
            System.out.println("Возраст самолета " + age + " лет.");
        }
    }


    public void infoAboutPlane() {
        Name name = new Name();
        name.howInfoName();
        Wing wing = new Wing();
        wing.showInfoWing();
        CountAge age = new CountAge();
        age.showAge();
        System.out.println("");
    }
}
