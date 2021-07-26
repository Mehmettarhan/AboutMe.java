package day21_Loops;

public class WhileLoopPractice {
    public static void main(String[] args) {

        String sentence="Java is fun, Java is cool and Java is the future of coding. So, let say JavaJava";

        int countJava=0;
        while (sentence.toLowerCase().contains("java")){
            countJava++;
            sentence=sentence.replaceFirst("Java",""); // replace "Java" with " ";

        }
        System.out.println("countJava= "+countJava);


    }
}
