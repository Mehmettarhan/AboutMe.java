package day32_MethodOverloading;

public class WarmUpTask1 {

    public static void main(String[] args) {

        int sum1= sumOf2Numbers(10, 20);

        int sum2=sumOf3Numbers(10, 20, 30);

        int sum3=sumOf4Numbers(10, 20, 30, 40);
        //System.out.println("sum1\n"+"sum2\n"+"sum3");


        System.out.println("--------------------------------------------------------");
        int r1=sum(10,20);

        double r2=sum(10, 20, 30);

        int r3=sum(10, 20, 30,40);

        System.out.println("r1= "+r1);
        System.out.println("r2= "+r2);
        System.out.println("r3= "+r3);

        double r4= sum(10.5, 20.5, 30.5);
        double r5= sum(1.1, 2.2, 3.3, 4.4);

        System.out.println("r4= "+r4);
        System.out.println("r5= "+r5);
    }

    public static int sumOf2Numbers(int a, int b) {return a + b; } // return method of sum two numbers

    public static int sumOf3Numbers(int a, int b, int c) { return a + b + c;}

    public static int sumOf4Numbers(int a, int b, int c, int d) {return a + b + c + d; }


    //-----------------------------------method overloading----------------------------------

    public static int sum(int a, int b){ return a+b; } // parameters must be different for over loading


    public static double sum(double a, double b, double c){return a+b+c; }//diff parameters but same elements


    public static int sum(int a, int b, int c, int d){ return sum( sum(a, b), sum(c, d) ); }


    public static double sum(double a, double b, double c, double d) { return a+b+c+d; }






}
/*
Task1:
    1. create a method that can find the sum of two numbers
                    method name: sumOf2Numbers

    2. create a method that can find the sum of three numbers
                    method name: sumOf3Numbers

    3. create a method that can find the sum of four numbers
                    method name: sumOf4Numbers
 */