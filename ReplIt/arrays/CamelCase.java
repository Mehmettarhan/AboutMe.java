package arrays;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class CamelCase {
    public static void main(String[] args) {



        String str="ThisHasManyWordsToFind";
        String temp="";


        int count =1;

        if (str.isEmpty()) {
            count = 0;
        }
        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                System.out.println(temp);
                temp="";
            }
            if (i==0){
                temp+=(""+str.charAt(i)).toUpperCase();
            }

            temp+=str.charAt(i);

        }
        System.out.println(temp);

        System.out.println("========================result=======================");

        // how to find the frequency of the word

        String s1="aaaaaabbbbbbbcccccccdddddddeeeefffffffffffffff";
        String longestOne="";
        for (int i = 0; i < str.length(); i++) {

            temp+=str.charAt(i);

            if (str.charAt(i)!=str.charAt(i+1)){

                if (temp.length()>longestOne.length()){
                    longestOne=temp;
                }
                temp="";
            }

        }
        System.out.println(longestOne);


    }
}
