package day20_Loops;

public class BranchingStatements {
    public static void main(String[] args) {

        for (int i = 0; i <=5; i++) {

            if(i==3){
                break; //stop
            }
            System.out.print(i);

        }
        System.out.println("------------------------------------------");

        for (int i = 0; i <=5; i++) {
            if(i==3){
                continue; //skip
            }
            System.out.println(i);

        }
        System.out.println("=========================================");

        for (int i = 0; i < 11; i++) { //print odd num between 1~10

            if(i%2==0){
                continue; // if i is even num
            }
            System.out.println(i);


        }
        System.out.println("------------------------------------------");

        // print all nums between 1~100 that are divisible by 3 and 5

        for (int i = 1; i < 100; i++) {
            if(i%15!=0){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("============================================");

        //print all letters between A~Z EXCEPT D, T, X

        for (char i='A'; i <='Z'; i++){
            if(i=='D'|| i=='T' ||i=='X'){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
