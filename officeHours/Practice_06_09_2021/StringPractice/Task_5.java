package officeHours.Practice_06_09_2021.StringPractice;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Task_5 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter full name:");
        String fullName=input.nextLine();
        String email="";
        String domain="@cybertek.com";

        // JamesBond Secret

        int spaceIndex=fullName.indexOf(" ");
        String firstName=fullName.substring(0,spaceIndex);
        System.out.println(firstName);
        String lastName=fullName.substring(spaceIndex+1);
        System.out.println(lastName);
        if (firstName.length()>=6 && lastName.length()>=6){
            email=firstName.substring(0,4)+lastName.substring(lastName.length()-3)+domain;
        }else{
            System.out.println("Invalid data");
        }


    }
}
 /* 5.Creating an email

          Ask user to enter fullname. FirstName and lastName should be at least 6 character long.
          If they are shorter than that print “Invalid data” and program should end.
          If the information provided is valid, you will take the first 4 characters of first string and
          combine them with the last three characters of the second string.
          At the end of your combined string add “@cybertek.com” and print the final string as your created email.
        The final email should be in all lowercase.

        input: JamesBond Secret
        output: jameret@cybertek.com

  */