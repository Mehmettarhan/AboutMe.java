package day34_LocalDayTime_Wrapper;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate eid = LocalDate.of(2021, 7, 20);

        System.out.println(eid);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println("----------------------------------------------------------");

        // create array of string to store 5 classmates'namess
        String[] names = {"Adnan", "Zahra", "Josh", "Emily"};

        LocalDate[] DoB = {LocalDate.of(1990, 12, 31),
                LocalDate.of(1991, 5, 1),
                LocalDate.of(1993, 9, 23),
                LocalDate.of(1995, 11, 22)};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "' birthday is: " + DoB[i]);

            System.out.println("---------------------------------------------");

            LocalDate person1 = LocalDate.of(1890, 12, 22);
            LocalDate person2 = LocalDate.of(1980, 10, 31);

            if (person1.isBefore(person2)) {
                System.out.println("person1 is older");
            } else {
                System.out.println("person2 is older");
            }


            System.out.println("-----------------------------------------------------");

            boolean r1 = person1.isLeapYear();
            System.out.println(r1);

            boolean r2 = LocalDate.of(2023, 1, 1).isLeapYear();
            System.out.println(r2);

            System.out.println("----------------------------------------------");

            LocalDate currentDate = LocalDate.now();

            System.out.println(currentDate);

            LocalDate unitAssessment3 = currentDate.plusDays(14);

            System.out.println(unitAssessment3);

            LocalDate unitAssessment4 = currentDate.plusMonths(6);

            System.out.println(unitAssessment4);

            LocalDate examDate = currentDate.plusWeeks(5);

            System.out.println(examDate);
        }


    }
}
