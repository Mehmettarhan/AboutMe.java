package day20_Loops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence= "Java Java";
        int count= 0;

        for (int i = 0; i <= sentence.length()-4; i++) {
            String each= sentence.substring(i, i+4);
                if(each.equals("Java")){
                    count++;
                }

        }
        System.out.println("count= "+count);

        /*
        String str1= sentence.substring(0,4); // "java"
        String str2= sentence.substring(1,5); //"ava "
        String str3= sentence.substring(2,6); //"va J"
        String str4= sentence.substring(3,7); //"a Ja"
*/

    }
}
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2
 */