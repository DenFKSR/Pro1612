package Laba7;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

import static Laba7.CurrentYear.year;

public class Main {
    public static void main(String[] args) {
        Plane Sukhoi = new Plane("SuperJet", 400.3, 2017);
        Sukhoi.infoAboutPlane();
        Plane IL = new Plane("IL76", 623.7, 1985);
        IL.infoAboutPlane();
    }
}
