package officeHours.Practice_06_09_2021;

import javax.smartcardio.CardException;
import java.util.Scanner;

public class CarpetShop {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Please type one of them.\n\tList of rooms\n1-bedroom\n2-kitchen");
        String roomType=scan.nextLine();

        switch (roomType){
            case "Kitchen":
                double area=0;
                System.out.println("Please enter radius:");
                double radius=scan.nextDouble();
                area=radius*radius*3.14;
                break;
            case "Bedroom":
                System.out.println("Enter length:");
                double length=scan.nextDouble();
                System.out.println("Enter width:");
                double width=scan.nextDouble();
                area= length*width;
            default:
                System.out.println("Invalid room type!");

        }


    }
}
