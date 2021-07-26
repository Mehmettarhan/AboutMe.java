package day13_Scanner;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the building number:");
        int buildingNumber= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter the address:");
        String address = scan.nextLine();

        System.out.println("Enter the city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter the state:");
        String state = scan.next();

        System.out.println("Enter the zip code:");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName=scan.nextLine();
        // being used after any other method, you have to need one extra nextLine method

        String shippingInfo = fullName+"\n"+buildingNumber+" "+address+"\n"+cityName+", "+state+" "+zipCode;

        System.out.println(shippingInfo);
        //String shippingInfo = fullName+"\n"+buildingNum+" "+streetAddress+"\n"+city+", "+state+" "+zipCode;

    }
}
/*
ShippingInfo
    ask the followings:
        1. Builder Number (nextInt)
        2. Street Address (nextLine)
        3. City Name  (nextLine)
        4. State ( next )
        5. Zip Code (next)
        6. Full Name
    print the shipping info of the person
    Ex:
        Aysu Ahmadil
        7925 Jones Branch Drive
        Mclean, VA 22012
 */