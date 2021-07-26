package day19_Loops;

import com.sun.tools.javac.file.SymbolArchive;

import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max= -2147483648; // this num is the minimum num you can get from java.

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a #:");
            int n=scan.nextInt();

            if(n>max){
                max=n;
            }

        }
        System.out.println("max= "+max);

        scan.close();


    }
}
/*
Ask user to enter a number for 5 times. then find the max num
 */