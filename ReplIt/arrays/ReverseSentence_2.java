package arrays;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversedSentence="";

        String[] words = sentence.split(" ");

        for (int i = words.length- 1; i >= 0; i--) {
            reversedSentence+= words[i]+" ";
            reversedSentence=reversedSentence.trim();
            System.out.println(reversedSentence);
        }
    }
}
