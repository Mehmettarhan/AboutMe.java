package day33_Methods;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTask3 {

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 3, 3, 4, 4, 5, 6};
        int[] result = {};

        for (int each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        System.out.println(Arrays.toString(result));

        System.out.println("------------------------------------------------");

        int[] array2= {100,200,300,400,500,200,100,600};

        int[] r1 = unique(array2);
        System.out.println(Arrays.toString(r1));

        System.out.println("------------------------------------------------");

        double[] array3 = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};

        double[] r2 = unique(array3);
        System.out.println(Arrays.toString(r2));


        System.out.println("--------------------------------------------------");

        String[] items ={"Apple", "Apple", "Orange", "Egg", "Egg", "Cherry"};
        String[] r3= unique(items);

        System.out.println(Arrays.toString(r3));



    }


    public static int[] unique(int[] array) {
        int[] result = {};

        for (int each : array) { // getting each elements
            if (frequency(array, each) == 1) { // unique element
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;

    }


    public static double[] unique(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;

    }


    public static String[] unique(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;

    }


    public static char[] unique(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);

            }
        }
        return result;

    }


    // {1,2,3,},    1
    public static int frequency(int[] array, int element) {
        int count = 0;

        for (int each : array) {
            if (each == element) {
                count++;
            }

        }
        return count;
    }


    public static int frequency(double[] array, double element) {
        int count = 0;

        for (double each : array) {
            if (each == element) {
                count++;
            }

        }
        return count;
    }


    public static int frequency(String[] array, String element) {
        int count = 0;

        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }

        }
        return count;
    }


    public static int frequency(char[] array, char element) {
        char count = 0;

        for (int each : array) {
            if (each == element) {
                count++;
            }

        }
        return count;
    }


}
/*
Task3:
 1. create method that accepts one integer array and one integer number and returns the frequency of the number
                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

 2. create method that accepts one double array and one double number and returns the frequency of the number


 3. create method that accepts one String array and one String and returns the frequency of the String
                Ex:
                    String[] array = {"Apple", "Apple", "Apple", "Orange"}

                    frequency(array, "Orange") ==> 1
 4. create method that accepts one char array and a char and returns the frequency of the char
 */