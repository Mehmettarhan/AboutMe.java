package day07_ShortHand_Relational;

public class RelationalOperators {

    public static void main(String[] args) {
        // > , >=
        System.out.println(10>11); // false
        System.out.println(10>=10); //true
        System.out.println(11>=9); //true
        System.out.println(200>=201); //false
        // < , <=
        System.out.println(100<97); //false
        System.out.println(67<57); //FALSE

        System.out.println(64<=65); //true
        System.out.println( 93<=83); //FALSE

        // ==: equal , !=: not equal
        System.out.println(5 == 7); //false
        System.out.println(5 !=6 ); //true
        System.out.println(29 == 29); //true

       // or logic: if either one is true, will get true. <<< True: at least one condition is true.
        // <<< False: if both conditions are false.

        //  and logic: True= if both conditions are true. False= at least one condition is false.
        // To vote: 1. Must be US citizen 2. At least 18 years old.
        // <<< Must be US citizen OR at least 18 years old.

    }
}
/*
3. EligileForLoan
            income has to be at least 60k
            at least have 2 years of work history
            at least have 700 of credit score
            at least 18 years old

        variables:    name, age, workHistory, creditScore, income
 */