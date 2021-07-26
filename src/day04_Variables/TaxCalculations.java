package day04_Variables;

public class TaxCalculations {
    public static void main(String[] args) {


        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;
        // minus state + federal tax
        double totalStateTax = salary*stateTax;
        double totalFederalTax = salary*federalTax;
        double salaryAfterTax = salary - totalStateTax - totalFederalTax;
        System.out.println(" You need to pay $"+ totalStateTax + " of state tax");
        System.out.println(" You need to pay $"+ totalFederalTax + " of federal tax");
        // your take home salary is salaryAfterTax
        System.out.println("your take home salary is salaryAfterTax");


    }




}
