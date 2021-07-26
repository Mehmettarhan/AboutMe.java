package day15_String;

import java.util.Locale;
import java.util.Scanner;

public class NameFormatting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first name:");

        String firstName =scan.nextLine().trim(); //mUHTAR
              firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("Enter last name");
        String lastName=scan.nextLine().trim();
        lastName=firstName.substring(0,1).toUpperCase() + lastName.substring(1);

        String fullName= firstName+" "+lastName;
        System.out.println(fullName);


    }
}

/*
task: enter first name:
     1. make sure there is no white space
 */