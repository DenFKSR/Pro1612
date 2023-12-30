package Laba7;

import java.time.Year;

public class CurrentYear {
    static int year = Year.now().getValue();
        public static int showCurrentYear(){
            return year;
        }
}
