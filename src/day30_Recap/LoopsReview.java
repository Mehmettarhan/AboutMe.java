package day30_Recap;

public class LoopsReview {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n================================================");

        for (int i=0; i<=20; i++){
            System.out.print(i+" ");
        }
        System.out.println("\n-----------------------------------------------");

        String str="Java";
        //          0123
        for (int i=0; i<4; i++){
            System.out.print(str.charAt(i));
        }
        System.out.println("\n==============================================");

        for (int i=1, ch=65; i<=26; i++, ch++ ){
            System.out.println(i+". "+(char)ch);
        }
        System.out.println("------------------------------------------------");

        for (char i='A', j='a'; i<='Z'; j++, i++){
            System.out.println(i+"-"+j);
        }
        System.out.println("---------=====================------------------");

        String word="Anna";
        // index     0123
        String reverse="";
        for (int i=word.length()-1; i>=0; i--){ // i: index numbers of word (in reversed order)
            reverse+=word.charAt(i);

        }
        boolean isPalindrome = word.equalsIgnoreCase(reverse);

        System.out.println("isPalindrome= "+isPalindrome);

    }
}
