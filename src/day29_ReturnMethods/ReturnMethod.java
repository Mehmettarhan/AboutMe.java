package day29_ReturnMethods;

public class ReturnMethod {

    public static void main(String[] args) {
        String str ="Java";
        String reverseStr= reverse(str);
        // boolean isPalindrome= isPalindrome(str);

    }

    public static String reverse(String str) { // abc
        String result = ""; // cba

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return result;

    }
    public static void isPalindrome(String str){

        String reversedStr=reverse(str); // first: reverse the given string
        if (reversedStr.equalsIgnoreCase(str)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }
    }

}
