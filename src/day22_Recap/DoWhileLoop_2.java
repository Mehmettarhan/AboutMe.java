package day22_Recap;

import java.util.Scanner;

public class DoWhileLoop_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sumOfEven=0;
        int sumOfOdd=0;
        int i=0;

        do {

            if (i%2==0){
                sumOfEven +=i;
            }else {
                sumOfOdd +=i;
            }

            // i++;

        }while (i++< 10);

        System.out.println("sumOfEven= "+sumOfEven);
        System.out.println("sumOfOdd= "+sumOfOdd);

        System.out.println("-------------------------------------------");

        String username= "JohnJames";
        String password= "John123";
        String u="";
        String p="";
        int attempts=1;

        while (  !(u.equals(username) && p.equals(password))  );// while the credentials are incorrect

        System.out.println("Enter your username:");
        u=scan.next();

        System.out.println("Enter your password:");
        p=scan.next();
        attempts++;

        if (i==3){
            System.out.println("Your account is locked.");
        }

      /*  do {
            System.out.println("Enter your username:");
            u=scan.next();

            System.out.println("Enter your password:");
            p=scan.next();
        }while (  !(u.equals(username) && p.equals(password))  );// while the credentials are incorrect

        System.out.println("Logged in");
*/



    }
}
