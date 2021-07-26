package day27_Recap;

public class FirstUniqueCharacter {  // Interview task
    public static void main(String[] args) {

        String str= "aaabcc  ddefgggh";

        // indexOf('a')==>0
        // lastIndexOf('a')==>0    then a is a unique char of str

        /* for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
        }
        */
        for(char each : str.replace(" ","").toCharArray() ){

            if (str.indexOf(each)==str.lastIndexOf(each)) // if char's first and last index num in str is same, then its unique
            System.out.println(each);
        }

    }
}
