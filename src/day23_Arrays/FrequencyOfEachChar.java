package day23_Arrays;

import java.util.Scanner;

public class FrequencyOfEachChar {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String str="aaaaaabccc";

        String removeDup=""; // a b c

        for (int i = 0; i <=str.length()-1 ; i++) {
            char ch =str.charAt(0);

            if (removeDup.contains( ""+ch)){
                continue; // skip it //continue is only for loop statements
            }

            removeDup+=ch;

            System.out.println(removeDup);

        }
        String result=""; // a2b1c3
                          // a b c
                          // 2 1 3

        char ch=removeDup.charAt(0); // 'a'
        int frequency=0;

        for (int i = 0; i <=str.length()-1 ; i++) {

            char each=str.charAt(i);
            if (each==ch){
                frequency++;
            }


        }
        result+= ""+ch+frequency;
        System.out.println("frequency= "+frequency);

    }
}
