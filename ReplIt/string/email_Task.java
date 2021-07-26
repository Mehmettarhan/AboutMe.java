package string;

import java.util.Scanner;

public class email_Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String gmail = scan.next();


        int indexOf_ = gmail.indexOf("_");
        int indexOfAt = gmail.indexOf("@");
        String firstName = gmail.substring(0, indexOf_);
        String lastName = gmail.substring(indexOf_ + 1, indexOfAt);
        String remaining = gmail.substring(indexOfAt);

        System.out.println("firstName= " + firstName);
        System.out.println("lastName= " + lastName);
        System.out.println("remaining= " + remaining);

        String result = lastName + "_" + firstName + remaining;
        System.out.println(result);
    }
}

