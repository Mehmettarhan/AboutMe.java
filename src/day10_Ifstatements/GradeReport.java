package day10_Ifstatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 135; // 0~100
        String grade = ""; // A, B, C, D, F

        if (score >= 0 && score <= 100) { // pre conditions: valid value

            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else { // opposite of pre condition
                grade = "F";
            }
            System.out.println("grade = " + grade);
        }else{
            grade = "Invalid";


        }
    }
}