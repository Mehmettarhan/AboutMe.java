package day15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName=scan.next();

        System.out.println("Enter last name:");
        String lastName=scan.next();

        char f=firstName.charAt(0);
        char l=lastName.charAt(0);

        String initial= f+"."+l;
        System.out.println("initials= "+initial);

    }
}
/*
  1. first name
  2. last name
  print the initials: Zahra Tarhan
  Z T

 */