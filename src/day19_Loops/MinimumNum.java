package day19_Loops;

import javax.swing.*;
import java.util.Scanner;

public class MinimumNum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int min=2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int n= scan.nextInt();
            if(n<min){
                min=n;
            }
            System.out.println("min= "+min);
            scan.close();

        }


    }
}
/*
Ask user to enter a num for 5 times. then return the min number.
 */