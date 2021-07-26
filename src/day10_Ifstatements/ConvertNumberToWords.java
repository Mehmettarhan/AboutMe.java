package day10_Ifstatements;

import sun.management.snmp.jvmmib.EnumJvmMemManagerState;

public class ConvertNumberToWords {
    public static void main(String[] args) {
       int number = 10;
       String word = "";

       if (number>=0 && number<=9){

           if (number == 0){
               word = "Computer";
           }else if (number == 1){
               word = "Pen";
           }else if (number == 2){
               word = "Pencil";
           }else if (number ==3){
               word = "Paper";
           }else if (number ==4){
               word = "USB";
           }else if (number ==5){
               word = "Mouse";
           }else if (number ==6){
               word = "NoteBook";
           }else if (number ==7){
               word = "Linux";
           }else if (number ==8){
               word = "Windows";
           }else{
               word = "www.google.com";
           }

       }else{
           word = "Such a word or number not found!";
       }
        System.out.println("word = "+word);

    }
}
