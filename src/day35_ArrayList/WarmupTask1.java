package day35_ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmupTask1 {// Array data structure(size) is fixed. You cannot change it
    public static void main(String[] args) {
                                   // array size
        LocalDate[] dates = new LocalDate[10];

        for (int i = 0; i < dates.length ; i++) {
            dates[i] = LocalDate.now().plusDays(i); // LOCALDATE.NOW GIVES CURRENT DATE
        }
        System.out.println(Arrays.toString(dates));

        for (LocalDate each : dates) {
            System.out.println(each.format(DateTimeFormatter.ofPattern("MMM/dd/YY, EE")));

        }



    }

}
