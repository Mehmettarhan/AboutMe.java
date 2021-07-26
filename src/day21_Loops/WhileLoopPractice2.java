package day21_Loops;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) { // we use while loop when we don't know for how many time we will repeat..
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        for (int j = 1; j <= 10; j++) {
            if (j%2==0){
                System.out.print(j+" "); // for loop is more useful than while loop//
            }

        }


    }
}
