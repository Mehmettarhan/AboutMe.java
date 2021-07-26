package day30_Recap;

public class LoopsReview3 {

    public static void main(String[] args) {

        String sentence = "I love Java, Java is funny, Java Java.";

        String word = "Java";
        int count = 0;

        while (sentence.contains(word)) { // false: if the sentence does not include the word
            sentence = sentence.replace(word, " "); // replaces the first matching word from sentence
            count++;
        }
        System.out.println(count);
        System.out.println(sentence);


        System.out.println("-----------------------------------------");

        for (int j = 0; j <= 5; j++) {

            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("--------------------------------------------");

        String str= "aabcccdee";

        for (int j = 0; j <=str.length()-1 ; j++) {

            char ch=str.charAt(j);
            int frequency=0;
            for (int i=0; i<=str.length()-1; i++){ //i: index numbers of str
                if (str.charAt(i)==ch){ //
                    frequency++;
                }
            }
            System.out.println(ch+"-"+frequency);
           /*
           if (frequency==1){
                System.out.println(ch);
            }
            */


        }



    }
}
