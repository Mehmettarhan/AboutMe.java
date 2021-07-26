package string;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next(),
        sandwich= "nothing";

        if (str.indexOf("bread") != -1 ){
            if(str.lastIndexOf("bread") != str.indexOf("bread")){
                sandwich= str.substring(str.indexOf("bread") +5, str.lastIndexOf("bread"));
            }
        }

        System.out.println(sandwich);
    }
}

