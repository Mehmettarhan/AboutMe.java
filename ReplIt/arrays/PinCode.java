package arrays;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        /*
        Write a program to ask user to "Please Enter your pinCode"
                          if the pinCode is valid print out "Welcome to your account "
                          if it is invalid ask again pinCode to verify it
                          Repeat this steps the user enters correct pinCode
         */
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 12340;
        int pinCode;
        int count = 0;
        do {
            if (count == 3) {
                System.out.println("Your account is locked");
                System.exit(0);
            }
            System.out.println("Please enter your pin code");
            pinCode = scan.nextInt();
            count++;

        } while (pinCode != secretPinCode);
        System.out.println("Welcome to your account");


    }


}



