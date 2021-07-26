package day30_Recap;

import java.util.Locale;

import java.util.Scanner;

public class LoopsReview2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer ="";
        int m=0;
        int sum=0;

        while (!answer.equals("no")) {//only it will STOP to run until the answer is "no"//false if answer is no
            System.out.println("Enter a number");
            m = scan.nextInt();
            sum+=m;
            System.out.println("Would you like to enter another number");
            answer=scan.next().toLowerCase();

            while (!(answer.equals("yes")|| answer.equals("no")) ){ //false: if the answer is yes or no
                System.out.println("Invalid answer! Would you like to enter another number");
                answer=scan.next();
            }
            if (answer.equals("no")){
                System.out.println("Thank you");
            }
        }
        System.out.println("sum="+sum);

    }
}
