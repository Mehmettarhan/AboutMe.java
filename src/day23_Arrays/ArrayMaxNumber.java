package day23_Arrays;

public class ArrayMaxNumber {

    public static void main(String[] args) {


        int [] num={10, 5, 400, 50, 0, -1};
        int max=num[0]; // 400
        int min=num[0]; //-1

        for (int i = 0; i <=num.length-1 ; i++) {

            int each=num[i];

            if (each>max){
                max=each;
            }
            if (each<max){
                min=each;
            }

        }
        System.out.println("max= "+max);
        System.out.println("min= "+min);
    }


}
