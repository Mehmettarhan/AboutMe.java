package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethod3 {

    public static void main(String[] args) {

        String str = "AABBBBCCCCCCC";
        String [] arr = str.split("");//eger bisey vermezsek toCharArray methodu gorevi gerir
        char[] arr2 = str.toCharArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        String result=removeDuplicates(str) ;
        System.out.println(result);
    }

    public static String removeDuplicates(String str){ //"AABBBBCCCCCCC"
        String result="";

        for (String each : str.split("")){
            if (!result.contains(each)){
                result += each;
            }
        }

        return result;
    }
}
