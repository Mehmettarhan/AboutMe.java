package Loops;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        //WRITE YOUR CODE HERE

        for (int j=0; j<=str.length()-3; j++){
            String triples= ""+str.charAt(j)+str.charAt(j)+str.charAt(j);
            if (str.substring(j,j+3).equalsIgnoreCase(triples)){
                count++;
            }
        }
        System.out.println(count);
    }
}
