package string;

import java.util.Scanner;

public class AEmail_Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String message = "";
        if (email.contains("_")) {
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            message = lastName + "_" + firstName + email.substring(email.indexOf("@"));
        } else {
            message = email;
        }
        System.out.println(message);
    }
}
/*
Swap first name with last name in the email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: barakobama@gmail.com

output: barakobama@gmail.com
 */
