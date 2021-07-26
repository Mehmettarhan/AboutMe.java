package day08_ifStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int number = -7;
        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = !positive && !negative;

        if(positive) { // if the num is positive:
            System.out.println(number + " is positive  ");
        }
            if (negative) { //if the num is negative:
                System.out.println(number + " is negative");
            }
                if (zero){ // if the num is zero:
                    System.out.println(number+" is zero");
                }





    }
}
