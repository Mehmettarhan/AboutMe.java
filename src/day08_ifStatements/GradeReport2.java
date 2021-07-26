package day08_ifStatements;

public class GradeReport2 {
    public static void main(String[] args) {

        int score = 75;
        boolean madeA = score >= 90 && score <= 100;
        boolean madeB = !madeA && score >= 80; // did not madeA and score is greater or equal to 80
        boolean madeC = !madeA && !madeB && score >= 70; // did not make A & B and score is greater than 70
        boolean madeD = !madeA && !madeB && !madeC && score >=60;
        boolean madeF = !madeA && !madeB && !madeC && !madeD;

        if (madeA){
            System.out.println("Excellent, you are the rock.");
        }

        if (madeB){ // OR== ||
            System.out.println("Doing good. You got B+.");
        }

        if (madeC){
            System.out.println("Not too shabby. You got a C.");
        }
        if (madeD){
            System.out.println("You passed.");
        }
        if (madeF){
            System.out.println("Failed.");
        }


    }
}
