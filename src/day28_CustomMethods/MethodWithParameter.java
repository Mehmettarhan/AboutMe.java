package day28_CustomMethods;

public class MethodWithParameter {

    public static void main(String[] args){
        eligible(210);

    }



    public static void eligible(int age){

        if (age>=21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }

    }
}
