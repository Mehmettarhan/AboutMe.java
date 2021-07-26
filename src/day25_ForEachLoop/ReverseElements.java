package day25_ForEachLoop;

import java.util.Arrays;

public class ReverseElements {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C#", "Cybertek", "Tarhan"};

        for (int j = 0; j < array.length; j++) { // J: index numbers of the array. starting from zero

            String element = array[j]; // "Java"
            String reverse = ""; //"avaJ" // to store the reversed version of the element

            for (int i = element.length() - 1; i >= 0; i--) {
                reverse += element.charAt(i); // gets the chars from the string element

            }
            array[j] = reverse; // assigning  reversed element to the index of array

        }

        System.out.println(Arrays.toString(array));


    }
}
/*
1. write a program that can  reverse each elements in an array of string
		Ex:
		    array = {"Java", "Python", "C#"}

	    	output:
	    		["avaJ", "nohtyP", "#C"]

 */