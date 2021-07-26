package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int number =100;

       if (number >0){
           System.out.println(number+" is positive");
       }else if (number < 0){
           System.out.println(number+" is negative");
       }else {
           System.out.println(number+" is zero");
       }
        System.out.println("--------------------"); // The difference between (if) and (else if).
        if (number >0){
            System.out.println(number+" is positive");
        }
        if (number < 0){
            System.out.println(number+" is negative");
        }else {
            System.out.println(number+" is zero");
        }

    }
}
