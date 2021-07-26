package day06_UnaryOperators;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2023;
        boolean isLeapYear = year % 4 == 0;
               // if the year divisible by 4, then the year is Leap Year.
        System.out.println("Year "+year +" is a Leap year: " + isLeapYear);




    }
}
/*
2. create a class named LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020

            output:
                2020 is leap year: true
 */