package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Zahra";
        String lastName = "Tarhan";
        String fullName = firstName + " " + lastName;
        // Employee' full name is: Mehmet King
        System.out.println( "Employee' full name is: "+fullName );
        String gender = "Female";
        // Mehmet King is Male
        int age = 25;
        boolean isFullTime = true;
        boolean isMarried = true;
        System.out.println( fullName + " is " + age +  "years old.");
        System.out.println(fullName + " is " + gender);
        System.out.println(fullName+ " is married: "+isMarried);
    }

/*
Task:
    1. create a class named EmployeeInfo
                1. declare the following variables:
                    name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                2. full info of the employee
 */


}
