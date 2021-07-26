package day35_ArrayList;



import day12_Scanner.Grade;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int numbers=0;
        //list.addAll(numbers);
        list.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9) );
        System.out.println(list);

        System.out.println("--------------------------------------------");

        ArrayList<String> students =new ArrayList<>();
        students.addAll(Arrays.asList("Dilem", "Abbos", "Atilla", "Mehmet", "Dilem", "Abbos"));

        System.out.println(students);
        students.removeAll( Arrays.asList("Dilem", "Abbos") );
        System.out.println(students);

        System.out.println("--------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5,4,5,5,5,6,6,6,7,7,9));
        System.out.println(nums);
        //nums.removeAll(Arrays.asList(1,2,5));
        nums.retainAll(Arrays.asList(1,3)); // except those(1,3) remove all
        System.out.println(nums);

        System.out.println("----------------------------------------------");

        ArrayList<String> groceryList =new ArrayList<>();
        groceryList.addAll(Arrays.asList("milk","soda","bread","cola","beer","water","wine"));

        boolean r= groceryList.containsAll(Arrays.asList("soda","bread","wine","apple"));
        System.out.println(r);
        System.out.println("--------------------------------------");
        ArrayList<String> names = new ArrayList<>();
        names.add("enes"); // IDJ executes codes from top to bottom and left to right.
        names.add("akbor"); // {enes, akbor}
        names.add(1, "alex"); //{ enes, alex, akbor}
        names.add(0,"alp");//{alp, enes, alex, akbor
        System.out.println(names);





    }
}
