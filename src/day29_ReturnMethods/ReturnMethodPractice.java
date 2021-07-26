package day29_ReturnMethods;

public class ReturnMethodPractice {

    public static void main(String[] args) {
        // find max number between 10 & 20, then multiply it by 2
        int [] numbers= {10,20,34,-3,-9,0,39};
        int max =numbers[0];
        int min=numbers[0];

        for (int each:numbers){
            max=max(each, max);
            min=min(each, min);
        }

        System.out.println("max= "+max);
        System.out.println("min= "+min);

    }

    public static int max(int a, int b){
       /*
        int max = 0;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
       return max;
        */
        return  (a > b)? a : b;

    }

    public static int min(int a, int b){ return (a<b)? a:b; }

    public static int maxNumberFromIntArray(int[] numbers){
        int max= numbers[0];
        for (int number: numbers){
           max= max(max, number);
        }

        return max;
    }

    public static int minNumberFromIntArray(int[] numbers){
        int min= numbers[0];
        for (int number: numbers){
            min= max(min, number);
        }

        return min;

    }



    /*
    create a return method that can return the maximum number from the array
    create a return method that can return the minimum number from the array
     */
}
