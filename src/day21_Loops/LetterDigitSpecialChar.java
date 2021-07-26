package day21_Loops;

public class LetterDigitSpecialChar {
    public static void main(String[] args) {

        String input="mn@#123Ab!";
        String letters="";
        String digits="";
        String specialChar="";

        for (int i = 0; i <input.length()-1 ; i++) {
            char each=input.charAt(i); // gets each chars from the string

            if (each>='A'&& each<='Z'){ // char uppercase
                letters+=each;
            }else if (each>='a'&&each<='z'){ // char lowercase
                letters+=each;
            }else if (each>='0'&&each<='9'){ // if char is digit
                digits+=each;
            }else {                          // if special chars
                specialChar+=each;
            }

        }
        System.out.println("letters= "+letters);
        System.out.println("digits= "+digits);
        System.out.println("specialChar= "+specialChar);
    }
}
/*
4. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
