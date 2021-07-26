package officeHours.Practice_06_09_2021;

import java.util.Scanner;

public class EstimatedTimeCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your speed:");
        int carSpeed=input.nextInt();

        if (carSpeed<48 || carSpeed>88){
            carSpeed=60;
            System.out.println("it is not allowed your speed is 60");
        }

        System.out.println("Please enter starting point");
        String startingPoint=input.nextLine();
        String destination ="";

        System.out.println("Please enter your distance between "+startingPoint+" to "+destination);
        double distance=input.nextDouble();
        double estimatedTime=distance/carSpeed;
        System.out.println("The ETA is "+estimatedTime+" hours from "+startingPoint+ " to "+destination);

    }

}
