package day10_Ifstatements;

public class Ternary_Practice {
    public static void main(String[] args) {
       int age = 23;
       String result = (age >= 21) ? "Eligible" : "Not eligible";

        System.out.println(result);

        int score = 80;
        System.out.println(   (score>=60) ? "PASSED" : "Failed"   );


    }
}
