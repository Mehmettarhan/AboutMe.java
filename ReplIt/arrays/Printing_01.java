package arrays;

import java.util.Scanner;

public class Printing_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {

            arr[i] = input.nextLine();

        }
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println(arr[i].substring(0, 3));

        }

    }
}
