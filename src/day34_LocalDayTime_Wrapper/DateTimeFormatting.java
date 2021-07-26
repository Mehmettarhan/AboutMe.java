package day34_LocalDayTime_Wrapper;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

    public static void main(String[] args) {

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY EEEE");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        //today.format(DF);

        System.out.println( today.format(DF) );


        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime.format (TF) );

        LocalTime time1 = LocalTime.of(17, 25);
        System.out.println(time1);

        System.out.println(time1.format(TF));

        System.out.println("----------------------------------------------");

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY, EEEE hh:mm a"); //a:represent pm//am
        LocalDateTime a = LocalDateTime.now();
        System.out.println(a);
        System.out.println(a.format(DTF));

        System.out.println("-----------------------------------------------------------");
        //1. use the LocalDate & Time get the date and time in the following format:
        //            Tuesday, 1:00 pm, Nov/24/2020

        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY");
        LocalDateTime time2 = LocalDateTime.of(2020, 12, 21, 23, 54);
        System.out.println(time2);

        System.out.println(time2.format(format));

        // what day is 2022-01-01
        String result = LocalDate.of(2022, 2, 22).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("result = "+result);


    }

}
// DATE FORMATTER: MM/dd/YYYY
// TIME FORMATTER: hh:mm
