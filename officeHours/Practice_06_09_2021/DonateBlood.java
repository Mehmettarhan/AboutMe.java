package officeHours.Practice_06_09_2021;

public class DonateBlood {
    public static void main(String[] args) {


        int age = 23;
        int weight = 52;
        if (age>=18){
            if (weight>50){
                System.out.println("You are eligible to donate blood");
            }else {
                System.out.println("You are not eligible to donate blood");
            }
        }else {
            System.out.println("Age must be greater than 18");
        }
        /*    ( Scanner Class can be used )

        Create a program that accepts age and weight(kg) as int.
          If age greater than or equal 18 and weight greater than 50 kg give a message
              EXPECTED  :  "You are eligible to donate blood"
          If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
              EXPECTED  :  "You are not eligible to donate blood"
          If age is smaller than 18 "Age must be greater than 18"
              EXPECTED  :  "Age must be greater than 18"
       */
    }
}
