package day29_ReturnMethods;

public class ReturnMethodPractice2 {

    public static void main(String[] args){
        // grade(78);


    }
    public static void grade(int grade){


        int score=0;
        if (score>100 || score<0){  // if the score is invalid
            System.out.println("Invalid");
            return; // exit the method
        }
        if (score>=90){
            System.out.println("a");
        }else if (score>=80){
            System.out.println("b");
        }else if (score>=70){
            System.out.println("c");
        }else if (score>=60){
            System.out.println("d");
        }else {
            System.out.println("f");
        }

    }


}
