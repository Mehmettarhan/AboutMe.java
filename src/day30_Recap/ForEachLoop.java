package day30_Recap;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500};

        for (int each : numbers) {
            System.out.println(each);
        }
        System.out.println("--------------------------------------");

        int max = numbers[0];
        int min = numbers[0];


        for (int number : numbers) {

            if (number > max) {
                max = number;
            }

        }
        System.out.println("max="+max);
        System.out.println("min="+min);


        System.out.println("------------------------------------");

        String[] group1={"Sophia", "Feruza", "Zahra"}; // adding two arrays to one array
        String[] group2= {"Mehmet", "Bilgun", "Danka", "Mucahit"};

        String[] group3= new String[group1.length + group2.length];

        int i = 0;

        for (String name : group1) {
            group3[i++]= name;
        }
        for (String name : group2) {
            group3[i++]=name;
        }
        System.out.println(Arrays.toString(group3));


    }

}


