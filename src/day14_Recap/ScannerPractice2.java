package day14_Recap;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your zip code:");
        long zipCode=scan.nextLong();

        System.out.println("How many people do you live with?");
        byte numberOfPeople=scan.nextByte();

        System.out.println("Are you married?");
        boolean isMarried=scan.nextBoolean();

        System.out.println("I see you're "+ ((isMarried)?"Married":"Not Married" )
                +" and live with "+numberOfPeople +" people in your house is in the "+zipCode+" area!"  );
    }
}
