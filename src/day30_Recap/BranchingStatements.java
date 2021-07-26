package day30_Recap;

public class BranchingStatements {
    public static void main(String[] args) {


        for (int i = 0; i <=5; i++) {

            if (i==3){
             // break; // exits the loop only
                //return; // exits the method
                continue; // skip the number 3 then keep going on
                //System.exit(i); // exits the method //terminates everything
            }
            System.out.println(i);
            //System.exit(i);

        }
        System.out.println("Hello world");
    }
}
