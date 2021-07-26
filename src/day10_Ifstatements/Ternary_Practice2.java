package day10_Ifstatements;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Ternary_Practice2 {
    public static void main(String[] args) {

        int number =100;
        String result = "";
        /*
        if (number >0){
            result = "Pos";
        }else if (number<0){
            result = "Neg";
        }else {
            result = "Zero"
        }

         */


        System.out.println("-----------------------------------------------");
        int score = 87;


        char grade = (score >= 90)?'A':(score >= 80)?'B':(score >= 70)?'C':(score>=60)?'D':'F';
        System.out.println(score);

        /*
        char grade = ' ';
        if(score >= 90){
            grade = 'A';
        }else if(score >= 80){
            grade = 'B';
        }else if(score >= 70){
            grade = 'C';
        }else if(score >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        */


    }
}
