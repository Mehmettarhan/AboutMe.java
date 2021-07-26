package day15_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter two strings:");
        String s1 =scan.nextLine();
        String s2=scan.nextLine();

        if (s1.length() >s2.length()){
            System.out.println("s1 is bigger.");
        }else if (s1==s2){
            System.out.println("s1=s2.");
        }else {
            System.out.println("s2 is bigger.");
        }
    }
}
