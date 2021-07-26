package day23_Arrays;

import java.util.Arrays; // import java util must be between package and class name.
public class ArrayUtility {
    public static void main(String[] args) {
        //toString method
        int[]array ={1,2,3,4,5,6,7,8};

        System.out.println(array);

        System.out.println(Arrays.toString(array)  );

        String[] array2= new String[5];
        System.out.println(array2);


        System.out.println(Arrays.toString(array2) );

        double[] nums=new double[5];
        System.out.println(Arrays.toString(nums));
        String [] students= {"Ali", "Temel", "Abbos", "Sabir", "Vjandita"};
        System.out.println(Arrays.toString(students) );

        Arrays.sort(students); // the array is sorted inascending order (a to z)

        System.out.println(Arrays.toString(students));

        int[] numbers={2,3,45,67,4,5,7,8,9,0,-5};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers) );
        System.out.println("Min num= "+numbers);
        System.out.println("Max num= "+numbers[numbers.length-1] );

        char[] chars={'z','v','c','b','t','p'};
        System.out.println(Arrays.toString(chars));
        Arrays.sort(chars);


        // Array.equals

    }
}

