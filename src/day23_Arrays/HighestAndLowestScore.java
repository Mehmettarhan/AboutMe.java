package day23_Arrays;

public class HighestAndLowestScore {
    public static void main(String[] args) {


        int[] scores = {85, 70, 95, 90, 100};

        String[] names = {"Mike", "Adam", "Tony", "John", "Ammy"};

        int max = scores[0];
        int min = scores[0];
        String maxName = "";
        String minName = "";
        for (int i = 0; i <= scores.length - 1; i++) {
            int each = scores[i];

            if (each > max) {
                maxName = names[i];
            } else if (each < min) {
                minName = names[i];
            }

        }
        System.out.println("Maximum scoring student is " + maxName);
        System.out.println("Minimum scoring student is " + minName);

        System.out.println("-----------------------------------------------------");




        int maxScore=scores[0];


        for (int i = 0; i < names.length-1 ; i++) {
            String eachName=names[i];
            int eachScore=scores[i];

            if (eachScore>maxScore){
                maxScore=eachScore;
                maxName=eachName;
            }
        }

        System.out.println("maxName= "+maxName);
        System.out.println("maxScore= "+maxScore);


    }


}

