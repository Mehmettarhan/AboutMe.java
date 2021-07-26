package day22_Recap;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctUsername = "cybertek";
        String correctPassword = "cybertek12345";

        System.out.println("Enter your username:");
        String userName = input.next();

        System.out.println("Enter your password:");
        String password = input.next();
        if (userName.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Successfully logged in");
            System.out.println("Hello Cybertek");

        } else {

            for (int i = 1; i <= 2; i++) {

                System.out.println("username or password is incorrect, please re-enter.");
                System.out.println("Enter your username:");
                userName = input.next();

                System.out.println("Enter your password:");
                password = input.next();

                if (userName.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Successfully logged in");
                    System.out.println("Hello Cybertek");
                    break; // exits the loo
                }

                if (i == 2) { // if user entered incorrect and we already used all the attempts
                    System.out.println("Your account is locked!");
                    System.exit(0);
                }


            }
        }
        System.out.println("Hello Cybertek");

        input.close();



    }
}

/*
1. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: cybertek
                    password: cybertek12345

   Ask the user to enter their credentials.
     If credentials are matched, your program should print "Logged in."
     If the credentials are not matched, the program should allow the user to have three attempts
     to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */
