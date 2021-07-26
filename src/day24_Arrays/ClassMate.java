package day24_Arrays;

import java.util.Arrays;

public class ClassMate {
    public static void main(String[] args) {

        String[] classMate = {"Gulistan","Fruza","Ahmet","Mehmet","Muhtar","Tamara","Abbos",
                "Shirin","Robinson","Shirin"};
        System.out.println(Arrays.toString(classMate));

        for (int i = 0; i <=classMate.length-1 ; i++) {
            System.out.println(classMate[i].substring(0,3));
/*
1. create string array, and store the names of your  class mates (10)
            print the first three characters of each name
 */
        }


    }
}
