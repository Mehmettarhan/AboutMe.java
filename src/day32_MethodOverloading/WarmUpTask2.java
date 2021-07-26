package day32_MethodOverloading;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.Arrays;

public class WarmUpTask2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array));
        int element = 10;

        array = addInteger(array, element); // {1,2,3,4,5,6,7,8,9,10}

        System.out.println(Arrays.toString(array));


        array = addInteger(array, 11);  // {1,2,3,4,5,6,7,8,9,10,11}
        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------------------");

        double[] array2 = {2.5, 3.5};
        System.out.println(Arrays.toString(array2));

        array2 = addDouble(array2, 4.5);
        System.out.println(Arrays.toString(array2));

        array2 = addDouble(array2, 5.5);
        System.out.println(Arrays.toString(array2));

        System.out.println("-----------------------------------------------------");

        String [] group1= {"Ali", "Ahmet", "Kerem", "Gulistan"};
        String student = "Rozerin";

        group1 = addString(group1, student); // {"Ali", "Ahmet", "Kerem", "Gulistan"}
        System.out.println(Arrays.toString(group1));


        System.out.println("-----------------------------------------------------");

        char[] array3 = {'A', 'B'};
        array3= addChar(array3, 'C');

        System.out.println(Arrays.toString(array3));


    }


    public static int[] addInteger(int[] array, int number) {
        /*
        int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
             result[i++] =each;
        }
        result[i] = number;
         */

        int[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = number;

        return result;


    }

                               // {1.5, 2.5, 3.5}      4.5
    public static double[] addDouble(double[] array, double number) {
        double[] result = Arrays.copyOf(array, array.length + 1); // {1.5, 2.5, 3.5, 0.0}
        result[result.length - 1] = number;

        return result;
    }

                                 // {"a", "b"}           "c"
    public static String[] addString(String[] array, String str) {
        String[] result = Arrays.copyOf(array, array.length + 1); // {"a, b, null}
        result[result.length - 1] = str; // {a, b, c}

        return result;


    }

                          // {'A', 'B'};        'C'
    public static char[] addChar(char[] array, char ch){
        char[] array3 = {'A', 'B'};
        //array3= addChar(array3, 'C');
        return array3;



    }


    //------------------------------Method Overloading------------------------------

     // adds int to int
    public static int[] addElement(int[] array, int number) {
        /*
        int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
             result[i++] =each;
        }
        result[i] = number;
         */

        int[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = number;

        return result;


    }

     // adds double to double
    public static double[] addElement(double[] array, double number) {
        double[] result = Arrays.copyOf(array, array.length + 1); // {1.5, 2.5, 3.5, 0.0}
        result[result.length - 1] = number;

        return result;
    }

     // adds string to string
    public static String[] addElement(String[] array, String str) {
        String[] result = Arrays.copyOf(array, array.length + 1); // {"a, b, null}
        result[result.length - 1] = str; // {a, b, c}

        return result;


    }

     // adds char to char
    public static char[] addElement(char[] array, char ch){
        char[] array3 = {'A', 'B'};
        array3= addChar(array3, 'C');

        return array3;

    }


    // merge two arrays of int





}

/*
Task2:
1. create a return method called addInteger that can add an Integer number after the  last index of an integer array
2. create a return method called addDouble that can add a double number after the last index of a double array
3. create a return method called addString that can add a String after the last index of a String array
4. create a return method called addChar that can add a char after last index of a char array
 */