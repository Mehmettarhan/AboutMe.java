package day28_CustomMethods;

import javax.sound.midi.Soundbank;

public class VoidMethodPractice {
    public static void main(String[] args) {
        printOddNumber(19,30);

        printEvenNumber(20, 46);

        calculateAge(1991, 2021);

        eligibleToVote(23, true);
        calculate(2, '-', 5);
    }

    public static void printOddNumber(int from, int to) {

        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }

    }

    public static void printEvenNumber(int from, int to){

        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static void calculateAge(int birthYear, int currentYear){
        System.out.print("Your age is: "+(2021 - birthYear));
    }

    public static void eligibleToVote(int age, boolean isUSCitizen){
        if (age>= 21 && isUSCitizen){
            System.out.println("You're eligible to vote.");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void calculate(int num1,  char operator, int num2){ // +, -, *, /, %

        switch (operator){
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case '*':
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case '/':
                System.out.println("Division: "+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder: "+(num1%num2));
                break;

            default:
                System.out.println("Invalid operator");


        }
    }



}


/*
task:
    1. create a method that can print odd numbers between 1~100 in a same line seperated by space

    2. create a method that can print even numbers between any given two numbers

    3. create a method that can calculate the age of the person

    4. check eligibility to vote
 */