package arrays;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int num=123456789;
        int sum=0;

        while (num>0){
            sum+=(num%10);
            num/=10;
        }
        System.out.println(sum);




    }
}
