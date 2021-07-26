package day21_Loops;

public class MultiplyTwoNumbers {

    public static void main(String[] args) {
        int a=5, b=-6;

        if (b<0){ // this is how to make b positive num
            b*=-1;
        }
        int result=0;

        for (int i = 0; i <b; i++) {
            result+=a;

        }
        System.out.println("result= "+result);

    }
}
/*
1. write a program that can multiply two numbers without using * operator

 */