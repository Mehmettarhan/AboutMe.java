package day20_Loops;

public class NumberOfCatsDogs {
    public static void main(String[] args) {

        String sentence="Cat Dog Dog Cat";

        int numberOfCats=0;
        int numberOfDogs=0;

        for (int i = 0; i <= sentence.length()-3; i++) { //we have to do this >sentence.length()
                                                         // - word.length() to avoid index out of range..
            String each = sentence.substring(i, i+3); // has three chars

            if(each.equals("Cat")){
                numberOfCats++;
            }
            if(each.equals("Dog")){
                numberOfDogs++;
            }

        }
        System.out.println("numberOfCats= "+numberOfCats);
        System.out.println("numberOfDogs= "+numberOfDogs);

    }
}
/*
3. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

        Ex:
            sentence = "cat dog dog cat"

            output:
                true
 */