package day14_Recap;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter product name:");
        String productName = scan.nextLine();

        System.out.println("Enter the price:");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity = scan.nextInt();

        double totalPrice = price*quantity;

        scan.nextLine();

        System.out.println("Enter your full name:");
        String firstName = scan.nextLine();

        scan.close();

        System.out.println(firstName+", your order for "+quantity+" "+productName+" has been placed. " +
                "Your total is $" +totalPrice);

        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println("age= "+age);





    }
}
/*
1. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */