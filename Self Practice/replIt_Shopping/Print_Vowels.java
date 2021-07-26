package replIt_Shopping;

import java.util.Scanner;

public class Print_Vowels {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String word=input.nextLine();
        String vowels="";

        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'||ch=='A'||ch=='E'||ch=='I'||ch=='U'||ch=='O'){
                vowels += ch;
            }

        }
        System.out.print(vowels);
    }
}
