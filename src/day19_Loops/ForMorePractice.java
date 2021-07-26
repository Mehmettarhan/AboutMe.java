package day19_Loops;

public class ForMorePractice {
    public static void main(String[] args) {

        for (int i = 1; i <=8; i++) {
            System.out.println("* * * * * *");

        }
        System.out.println("-----------------------------------------------");
        System.out.println("* * * * * *");

        for (int i = 1; i <=8; i++) {
            System.out.println("*         *");

        }
        System.out.println("* * * * * *");

        System.out.println("------------------------------------------");

        int sum =0;

        for (int i = 1; i < +100; i++) {
            sum +=i;

        }
        System.out.println("sum= "+sum);
    }
}
/*

2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */
/*
3. print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *
 */
/*
5. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

                input : 200
                output : 20100
 */