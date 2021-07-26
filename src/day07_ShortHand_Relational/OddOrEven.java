package day07_ShortHand_Relational;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 101;

        boolean even = number%2 ==0;
        boolean odd = number%2 !=0; // if there si a remainder

        System.out.println(number+" is even number: "+even);
        System.out.println(number+" is odd number: "+odd);


    }
}
