package day14_Recap;

import java.util.Scanner;

public class NumberOrDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100000");
        int num = scan.nextInt();

        String result = "";

        if (num >=1 && num<=100000){

            if (num <=9){ // false num > 9
                result = "1 digit";

            }else if (num<=99){ // false num > 99
                result = "2 digit";

            }else if (num<=999){ // false num > 999
                result = "3 digit";
            }else if (num<=9999){ // false num > 9999
                result = "4 digit";
            }else if (num<=99999){
                result = "5 digit";
            }else {
                result = "6 digit";
            }

        }else {
            result = "Invalid number";
        }
        String result2 = (num >=1 && num<=999999)?(num<=9)? "1 digit" :(num<=99)? "2 digits" :(num<=999)?
                "3 digits" :(num<=9999)? "4 digits" :(num<=99999)? "5 digits": "6 digits"
        : "Invalid";

        System.out.println(num+" has "+result+"."); //System.out.println(n+" has " + result);

        scan.close(); // make sure to close the statement always....

    }
}
