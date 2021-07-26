package officeHours.Practice_06_09_2021.StringPractice;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word=input.next();

        if (word.isEmpty());{
            System.out.println("It cannot be empty"); // length()-1: last
         } if (word.length()<2){
            System.out.println(word);
         } else{
            System.out.println(word.charAt(0)+""+word.charAt(1));
            // substring
            System.out.println(word.substring(0,3));
            System.out.println(word.substring(3));
        }




    }
}
/*
        (substring-length-isEmpty)

                2.Given a string, return the string made of its first two chars,
                so the String "Hello" yields "He". If the string is shorter than length 2,
                return whatever there is, so "X" yields "X",
                and the empty string "" yields the empty string "".

                    Input :"Hello"   → "He"
                    Input :"abcdefg" → "ab"
                    Input :"a"         → "a"
                    Input :""         → "It can not be empty"
         */