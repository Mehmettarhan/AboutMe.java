package day14_Recap;

public class LetterOrDigitOrSpecialChar{
    public static void main(String[] args) {

        char ch='0';

        boolean isDigit=ch >='0' && ch <='9';
        boolean isLetter=(ch>='A' && ch<='Z') || (ch >='a' && ch <='z');

        String result="";
        if (isDigit){
            result="is digit";
        }else if (isLetter){
            result="is Letter";
        }else {
            result="is special character";

        }

        System.out.println(result);

    }
}
