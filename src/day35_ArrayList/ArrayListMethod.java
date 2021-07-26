package day35_ArrayList;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("eggs");
        groceryList.add("milk");
        groceryList.add("water");
        groceryList.add("bread");

        System.out.println(groceryList);

        groceryList.set(0, "apple"); // set(index, Object): replaces the old element at given index with a new element
        groceryList.set(3, "soda");
        System.out.println(groceryList);
        System.out.println("----------------------------------------");

        groceryList.remove(1);
        groceryList.add(2, "orange");
        System.out.println(groceryList);

        boolean r1 =  groceryList.remove("water");
        System.out.println(groceryList);
        System.out.println("r1= "+r1);

        boolean r2 = groceryList.remove("facial mask");
        System.out.println(groceryList);
        System.out.println("r2= "+r2);

        System.out.println("------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10); //0
        list1.add(20); //1
        list1.add(30); //2
        list1.add(40); //3
        list1.add(50); //4

        list1.remove((Integer) 30);
        System.out.println("list1= "+list1);

        System.out.println("-------------------------------------------");

        groceryList.clear();
        System.out.println("groceryList= "+groceryList);

        list1.clear();
        System.out.println("list1= "+list1);

        System.out.println("---------------------------------------------");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('A');
        list.add('C');

        System.out.println(list);

        list.indexOf('B');
        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (Character each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                uniqueChars.add(each);
            }

        }
        System.out.println("uniqueChars= "+uniqueChars);

        System.out.println("----------------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');
        System.out.println(characters);

        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i <characters.size() ; i++) {
            if (!result.contains(characters.get(i))){
                result.add(characters.get(i));
            }

        }
        System.out.println("result= "+result);

    }

}
