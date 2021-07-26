package day17_String;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String account = scan.next();
        char firstChar = account.charAt(0);

        switch (firstChar) {
            case '2': //if first character of account is 2
                if (account.length() == 7) {
                    System.out.println("Valid account");
                } else { // if length if account is not 7
                    System.out.println("INVALID: It should be 7 char. long");
                }
                break;
            case '5':
                if (account.length() == 10) {
                    System.out.println("Valid account");
                } else {
                    System.out.println("Invalid account: it should be 10 char. long");
                }
                break;
            default:
                System.out.println("Invalid");


                if (account.length() == 7 || account.length() == 10) {
                    if (account.charAt(0) == '2' && account.length() == 10) { //if the first char. 2 and
                        System.out.println("Valid account");
                    } else if (account.charAt(0) == '5' && account.length() == 10) {
                        System.out.println("Valid account");
                    } else {
                        System.out.println("Invalid");
                    }

                } else {
                    System.out.println("Invalid Account");
                }
        }
    } }
/*
1.Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not
    meet the expected results print “Invalid account number”
 */