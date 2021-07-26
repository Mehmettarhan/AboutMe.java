package day24_Arrays;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        // Split Method
        String sentence="I love Java programing language";

        String [] words= sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i >=0 ; i--) {
            System.out.print(words[i]+" ");

        }
        System.out.println();

        String email= "Mehmet@gmail.com";

        String [] arrays=email.split("@");

        System.out.println(Arrays.toString(arrays));

        String firstName= arrays[0];


        System.out.println("firstname= "+firstName);

        // toCharArray

        String str= "A B C D E";
        char[] characters=str.toCharArray();
        System.out.println(Arrays.toString(characters));

    }
}
/*
String[] words =  sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i]+" ");
        }

        System.out.println();

        String email = "James@gmail.com";

         String[] arrays =  email.split("@"); //{James, gmail.com}
        System.out.println(Arrays.toString(arrays));

        String firstname = arrays[0];

       System.out.println("firstName = " + firstname);
 */