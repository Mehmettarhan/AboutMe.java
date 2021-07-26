package string;

import java.util.Scanner;

public class MidleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.next();
        int length = word.length();

        if (length >= 1 && length % 2 == 1) { // ABDCE===01234

            System.out.println(word.charAt((length - 1) / 2)); // middle char is always equals length/2.

        } else if (word.length() == 1) {
            System.out.println("word+word+word");

        } else if (word.length() >= 4 && word.length() % 2 == 0) {

            System.out.println("" + word.charAt(length/ 2 - 1) + word.charAt(length / 2));
        }else if(length==2){
            System.out.println(word+word);


        }

        }
    }
/*
                  WRITE MIDDLE CHARS
When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      oak ==> a
      javav ==> v
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      # ==> ###
      q ==> qqq
      q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
     java ==> av
     apples ==> pl
     apples ==> pl
     #$%^&* ==> %^
     #$%^&* ==> %^
2 characters, print those 2 characters twice
      @@ ==>@@@@
      @@ ==>@@@@
      $$ ==>$$$$
      $$ ==>$$$$
      hi ==> hihi
 */