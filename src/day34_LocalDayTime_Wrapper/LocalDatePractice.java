package day34_LocalDayTime_Wrapper;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDatePractice {
    public static void main(String[] args) {

        String[] students = {"Dilem", "Dilek", "Didem", "Demet" , "Derya"};
        LocalDate[] DoB = {
                LocalDate.of(1991, 12, 21),
                LocalDate.of(1992, 11, 25),
                LocalDate.of(1993, 10, 22),
                LocalDate.of(1998, 9, 19),
                LocalDate.of(2000, 8, 20) };

        LocalDate youngest = DoB[4];
        int index = 0;

        for (int i=0; i<DoB.length; i++){
            if (DoB[i].isAfter(youngest)){
                youngest=DoB[i];
            }
        }

        System.out.println("youngest= "+youngest);
        System.out.println(students[index]);

        System.out.println("------------------------------------------------------");
        DateTimeFormatter DF= DateTimeFormatter.ofPattern("EEEE, MMM/dd/YYYY");

        for (int i=0; i<students.length; i++){
            System.out.println(students[i]+" was born on "+ DoB[i].format(DF));
        }

    }
}
//Task:
//    1. create string array to have 5 of your classmate's names
//
//    2. create an array that contains thier DofB
//
//    3. find out who is the youngest person
//
//    4. find out who was born on leap year