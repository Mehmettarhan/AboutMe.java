package day23_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int sum=0;

        int[] numbers = new int[ scan.nextInt() ];

        for (int i = 0; i <=numbers.length-1 ; i++){// used for getting the user inputs and store it into the array
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();
            sum+=numbers[i];
        }
        System.out.println("sum= "+sum);

        double average= (double) sum/numbers.length;
        System.out.println("average= "+average);

        scan.close();
    }

}
