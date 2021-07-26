package day17_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String sentence="My favorite programming languages are: C#, Java, JavaScript";
        boolean hasPython = sentence.contains("Python");
        boolean hasJava= sentence.contains("Java");
        // boolean hasJava2 =sentence.toLowerCase().contains("java");

        System.out.println("hasPython= "+hasPython); // F
        System.out.println("hasJava= "+hasJava); // T

        System.out.println("--------------------------------------");

        String sentence2 = "Cybertek School is the best";
        boolean startWithCybertek= sentence2.startsWith("Cybertek"); // T
        boolean startWithSchool= sentence2.startsWith("School"); // F

        System.out.println("startWithCybertek= "+startWithCybertek);
        System.out.println("startWithSchool= "+startWithSchool);


    }
}
