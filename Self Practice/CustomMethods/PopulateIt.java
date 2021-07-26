package CustomMethods;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateIt {

    public static int[] populate(int[] r) {
        // your codes here:
        for(int k=0; k<r.length; k++){
            r[k]=k+1;
        }
        return(r);

    }

    // Do not change
    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
