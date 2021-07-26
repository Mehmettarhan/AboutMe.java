package day09_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
       int a = 20, b = 20;

       if (a>b){
           System.out.println(a+" is maximum");
       }else if (b>a){
           System.out.println(b+" is maximum"); // three or more conditions: else if
       }else {
           System.out.println("equal");
       }


    }
}
