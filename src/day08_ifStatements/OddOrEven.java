package day08_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 24;
        boolean odd = number%2 != 0;

        if (odd) { //if the num is odd
            System.out.println(number+" is odd number");
        }
        if (!odd){ //if number is not odd
            System.out.println(number+" is even number");

        }

    }
}
