package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 89;
        if (score >= 90 && score <= 100){ // false; score <90
            System.out.println("Your grade is: A");
        }else if (score>=80){ // become false: when score < 80
            System.out.println("Your grade is: B");
        }else if (score >= 70){ // false: score < 70
            System.out.println("Your grade is: C");
        }else if (score >= 60){ // this statement becomes false when the grade is < 60
            System.out.println("Your grade is: D");
        }else{ // False: WHEN THE GRADE IS LESS THAN 60
            System.out.println("Your grade is: F");

        }
    }
}
