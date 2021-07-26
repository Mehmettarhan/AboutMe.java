package day25_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers= {1,2,3,4,5};
        // index :      0 1 2 3 4 5

        for (int i = 0; i <= numbers .length; i++) {
            System.out.println(i);

        }
        System.out.println("==============================================");

        for (int each : numbers ){ // each : ELEMENTS OF THE ARRAY
            System.out.println(each);

        }
        System.out.println("----------------------------------------------");

        String[] names= {"Hazime", "Gulistan", "Nurhan", "Resul", "Berivan", "Yildiz", "Ahmet",
                "Ibrahim", "Emin", "Mazhar", "Mehmet", "Hamza", "Keles"};


        for (String eachName : names){
            System.out.println(eachName);
        }
        // we can use each loop if we don't need to do indexes


    }
}
