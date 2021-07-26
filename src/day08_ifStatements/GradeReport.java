package day08_ifStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 90;

        if (score >= 90 && score <= 100){
            System.out.println("Excellent, you are the rock.");
        }

        if (score>=80 && score <= 89){ // OR==>> ||
            System.out.println("Doing good. You got B+.");
        }

        if (score >=70 && score <= 79){
            System.out.println("Not too shabby. You got a C.");
        }
        if (score >=60 && score <=69){
            System.out.println("You passed.");
        }
        if (score<60){
            System.out.println("Failed.");
        }


    }
}
/*
score << grade:
 A: 90 <= score<= 100
 B: 80 <= // <=89
 C: 70 <=// <= 79
 D: 60<= // <= 69

possible outcomes:
 */