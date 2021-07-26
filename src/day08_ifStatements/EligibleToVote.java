package day08_ifStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Mehmet";
        int age = 30;
        String citizen = "USA";

        Boolean eligibleToVote = age >=21 && citizen == "USA";

        if (eligibleToVote){ //eligible
            System.out.println(name+" is eligible to vote.");
        }

        if (!eligibleToVote){ //not eligible
            System.out.println(name+" is not eligible to vote.");
        }


    }

}
