package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        if (!(email.contains("@")) || !(email.indexOf("@")==email.lastIndexOf("@"))  ){
            System.out.println("invalid email");
        }else{

            String[] splitEmail=email.split("@");
            System.out.println(Arrays.toString(splitEmail));//[info, cybertekschool.com]

            System.out.println("Email id: "+splitEmail[0]);
            System.out.println("Email domain: "+splitEmail[1]);
        }
    }
}
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email
email -> hello-gmail.com

Output:
invalid email
email -> my@fancy@email.com

Output:
invalid email
 */