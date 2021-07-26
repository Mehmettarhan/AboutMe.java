package day09_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {

        int num1 = 20, num2 = 30;
        if (num1> num2){
            System.out.println(num1+" is maximum");
        }
        if (num2>num1){
            System.out.println(num2+" is maximum");
        }
    }
}
/*
1. write a program that can print out the maximum number between two different numbers
            Ex:
                num1 = 20;
                num2 = 30;

            output:
                    30 is the maximum number

    2. write a program that can print out the minimum number between two numbers

        Ex:
            num1 = 20;
            num2 = 30;

            output:
                20 is the minimum number

    3. write a program that can find the number of days in a month (Assume that Feb has 28 days)
            Ex:
                month = 2

            output:
                    28 days

        Hints: you will need single if statements for:
              28 days: 2
              30 days: 4, 6, 9, 11
              31 days: 1, 3, 5, 7,8,10, 12
 */