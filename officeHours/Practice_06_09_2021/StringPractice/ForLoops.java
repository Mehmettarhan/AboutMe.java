package officeHours.Practice_06_09_2021.StringPractice;

public class ForLoops {
    public static void main(String[] args) {

        String name="Cybertek School";
        int i=0;
        for (i = 0; i<name.length(); i++) {
            System.out.print(name.charAt(i));

            System.out.println("========================reverse=====================");

            for (i = name.length()-1;  i>=0; i--) {
                System.out.println(name.charAt(i));

            }

        }
    }
}
