package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hourly/rate?");
        double hourlyRate = input.nextInt();

        System.out.println("How many hour per/week?");
        int weeklyHour = input.nextInt();

        System.out.println("How many weeks per/year?");
        int weeks = input.nextInt();

        double salary = hourlyRate*weeklyHour*weeks;

        System.out.println("You are making $"+hourlyRate+" per/hour");
        System.out.println("Your are working "+weeklyHour+" per/week");
        System.out.println("You are working "+weeks+" per/year");
        System.out.println("salary = "+hourlyRate*weeklyHour*weeks);

    }
}
