package day07_ShortHand_Relational;

public class ShortHandRelational {
    public static void main(String[] args) {
        // *= multiplication operator
        double salary = 100000;
        // salary = salary * 2;
        salary *= 2;
        System.out.println("salary= "+ salary);
        salary *= 1.5;
        System.out.println("salary= "+salary);
        System.out.println("-------------------");
        // /= Division operator
        double slices = 10; //10.0
        slices /= 3;
        System.out.println("slices = "+ slices);
        System.out.println("-----------------------");
        //%= Remainder operators //105 cents is 4 quarters and 5 cents
        int cents = 105;
        int quarters = cents/25;
        cents %= 25;
        System.out.println("quarters =" +quarters);
        System.out.println("cents= "+cents);

        System.out.println("---------------------");



    }

}
