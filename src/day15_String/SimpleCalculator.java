package day15_String;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scan.nextDouble();

        System.out.println("Enter a math operator:");
        char mathOperator = scan.next().charAt(0);

        System.out.println("Enter second number:");
        double num2 = scan.nextDouble();

        double result=0;
        switch (mathOperator){
            case '-':
                result=num1-num2;
                break;
            case '+':
                result=num1+num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            default:
                System.out.println("Invalid operator!");
                System.out.println("result= "+result);


        }
        System.out.println("result= "+result);


    }
}
/*
ask:
   1. num1
   2. math operator
   3. num2   example: 20 (-) 10=10 or 21(*)3=63
 */