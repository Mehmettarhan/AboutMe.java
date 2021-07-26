package day08_ifStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        String name = "Mehmet";

        int score = 50;

        boolean passed =score >= 60;

        if(passed) { //if student passed exam
            System.out.println("Congrats "+name+" you passed the exam.");
        }

        if(!passed){ // if student failed the exam
            System.out.println("Franky! You failed the exam.");
        }



    }
}
