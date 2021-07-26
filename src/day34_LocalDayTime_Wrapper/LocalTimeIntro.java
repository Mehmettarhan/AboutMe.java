package day34_LocalDayTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime breakTime= now.plusMinutes(15);
        System.out.println(breakTime);
        LocalTime quizDue = breakTime.plusMinutes(20);
        System.out.println(quizDue);

        LocalTime comeBackAt= LocalTime.of(11, 23, 45);
        System.out.println("Come back at: "+comeBackAt);
    }
}
