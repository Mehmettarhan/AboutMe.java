package day15_String;

import java.lang.String;

public class StringIntro {
    public static void main(String[] args) {
        // Scanner s= new Scanner(System.in);

        String str1 = "Cybertek"; // Literal
        String str2 = new String("Cybertek");

        System.out.println("----------------------------");
        String s1="Cat";
        String s2="CAt";
        String s3="Cat";

        System.out.println(s1==s2); // false
        System.out.println(s1==s3); //true

        System.out.println("----------------------------");

        String s4= new String("Dog");
        String s5=new String("Dog");
        String s6=new String("Dog");
        String s7=s4;


    }
}
