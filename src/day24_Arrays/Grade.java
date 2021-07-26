package day24_Arrays;

public class Grade {
    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah", "Adnan", "Muhtar", "Zahra"};
        int[] scores = {90, 75, 80, 79, 92, 97};
        char[] grades = new char[names.length]; // {A, B, C}

        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        int countF=0;


        for (int i = 0; i < grades.length; i++) { // { i:0, 1, 2, 3, 4




            int score = scores[i];

            if (score >= 90) {
                grades[i] = 'A';
                countA++;
            } else if (score >= 80) {
                grades[i] = 'B';
                countB++;
            } else if (score >= 70) {
                grades[i] = 'C';
                countC++;
            } else if (score >= 60) {
                grades[i] = 'D';
                countD++;
            } else {
                grades[i] = 'F';
                countF++;
            }
            System.out.println(names[i]+"' score is "+scores[i]+", made "+grades[i]);
        }



    }
}
 /*
        2. given the following arrays:
     String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];
         */