package day23_Arrays;

import java.security.SecureRandom;

public class MyClassMates {
    public static void main(String[] args) {

        // if we know what are the elements are
        String [] friends= {"Ahmet" , "Mehmet" , "Adnan" , "Merve" , "Dilara"}; // size is 5
        System.out.println("Size: "+friends.length);

        for (int i = 0; i <= friends.length-1; i++) {
            System.out.println(friends[i]);

        }

        System.out.println("=============================================================");



        // if we don't know what are the elements are but we do know many elements we want to store
        String[] friends2= new String[4]; // size 5
        System.out.println("Size: "+friends2.length);
        friends2[1]="Zahra";
        friends2[4]="Resul";
        friends2[5]="Hazime"; // Pay close attention, Array's size is fixed
        for (int i = 0; i <=friends2.length-1 ; i++) {
            System.out.println(friends2[i]);
        }


    }
}
