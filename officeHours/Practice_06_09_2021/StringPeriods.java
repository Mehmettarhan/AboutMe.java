package officeHours.Practice_06_09_2021;

import java.util.Arrays;

public class StringPeriods {
    public static void main(String[] args) {


        String word= "abcdfabcdfabcfdabdf";
        String longestOne="";
        String temp="";

        for (int i = 0; i < word.length()/2; i++) {
            temp+=word.charAt(i);

            String[] split = word.split(temp);
            if (split.length==0 && longestOne.length()<temp.length()){
                longestOne=temp;
            }
        }
        System.out.println("longestOne= "+longestOne);

    }
}
