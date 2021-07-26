package day03_Varibales;

public class SalaryCalculator {

    public static void main(String[] args) {

        byte hourlyRate = 60;
        byte weeklyHours = 50;
        byte numberOfWeeksInAYear = 48;

        int salary = hourlyRate * weeklyHours * 52;

        System.out.println(salary);
    }




}
