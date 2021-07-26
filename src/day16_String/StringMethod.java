package day16_String;

import javax.swing.*;

public class StringMethod {
    public static void main(String[] args) {
        String email="Cybertek@yahoo.com";
        email=email.replace("yahoo", "gmail"); // replace first method

        System.out.println(email);

        String sentence= "C# is cool, C# is fun";
        sentence=sentence.replaceFirst("C#","Java"); // replace the first matching only

        System.out.println(sentence);

        System.out.println("-----------------------------------------------------------------");
        String sentence2= "Java is a cool language";
        //  index: 0123456789
        int indexOfFirstA = sentence2.indexOf("a");
        int indexOfSecondA = sentence2.indexOf("a ");
        int indexOfThirdA = sentence2.indexOf(" a ");
        int indexOfFourthA = sentence2.indexOf("la");
        int indexOfFifthA = sentence2.indexOf("ag");

        System.out.println(indexOfFirstA);
        System.out.println(indexOfSecondA);
        System.out.println(indexOfThirdA);
        System.out.println(indexOfFourthA);


    }
}
