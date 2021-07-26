package officeHours.Practice_06_09_2021;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int quantity = 30;
        double unitPrice= 100;
        double totalCost = quantity*unitPrice;
        double discountRate = 0.1;
        double totalDiscount = 0;

        if (totalDiscount>100){
            totalDiscount = discountRate*totalCost;
            System.out.println("You get a discount of "+totalDiscount+" " +
                    "and your total cost is "+(totalCost-totalDiscount));
        }
        else{

        }
        System.out.println("No discount applied");

    }
}
