package day13_Scanner;

import java.util.Scanner;

public class NextMethod2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Enter

        System.out.println("Enter your age");
        int age = scan.nextInt(); //19

        scan.nextLine();

        System.out.println("Enter your job title:");
        String jobTitle = scan.nextLine();

        System.out.println("age = "+ age);
        System.out.println("jobTitle= "+jobTitle);


    }
}
