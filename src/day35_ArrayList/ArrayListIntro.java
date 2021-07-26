package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {
        int[] nums = new int[10]; // size is 10 fixed
        System.out.println(Arrays.toString(nums));


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10); //0, autoboxing
        numbers.add(20); //1,
        numbers.add(30); //2,
        numbers.add(40); //3,
        numbers.add(50); //4,
        numbers.add(1, 25);
        System.out.println(numbers);
        System.out.println(numbers.get(2));

        System.out.println(numbers.size());

        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(numbers.get(i));

        }

    }

}
