package day22_Recap;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1;
        int n2;
        char operator;
        String answer = "";

        while (!(answer.equals("no"))) { // if the answer is NOT no
            System.out.println("Enter two numbers:");
            n1 = scan.nextInt();
            n2 = scan.nextInt();

            System.out.println("Enter a math operator");
            operator = scan.next().charAt(0);

            if (operator == '-') {
                System.out.println("Subtraction: " + (n1 - n2));
            } else if (operator == '+') {
                System.out.println("Addition: " + (n1 + n2));
            } else if (operator == '*') {
                System.out.println("Multiplication: " + (n1 * n2));
            } else if (operator == '/') {
                System.out.println("Division: " + (n1 / n2));
            } else {
                System.out.println("Invalid Operator");
            }
            System.out.println("Do you want to continue?");
            answer = scan.next().toLowerCase();


            while (!(answer.equals("yes") || answer.equals("no"))) ;
            {
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase();
            }
        }

    }
}
