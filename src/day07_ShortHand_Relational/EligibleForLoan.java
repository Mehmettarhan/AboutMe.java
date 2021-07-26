package day07_ShortHand_Relational;

public class EligibleForLoan {
    public static void main(String[] args) {
        String name = "Randy";
        int age = 49;
        int workHistory = 0;
        int creditScore = 0;
        double income = 100000;

        boolean isEligible = age >= 18 && workHistory >= 2 && creditScore >= 700 && income >= 60000;

        //                49>=  18  && 7 >= 2  && 760 >= 700  && 45000 >= 60000
        System.out.println( name +" is eligible for loan: "+isEligible);



    }
}
 /* EligileForLoan
        income has to be at least 60k
        at least have 2 years of work history
        at least have 700 of credit score
        at least 18 years old

        variables:    name, age, workHistory, creditScore, income
        */