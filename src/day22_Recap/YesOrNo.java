package day22_Recap;

import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid entry, please re-enter ");
            answer = scan.next().toLowerCase();
        }

            if (answer.equals("yes")) {
                System.out.println("Congrats");

            }else {
                System.out.println("Why not?");
            }
            scan.close();




    }
}
