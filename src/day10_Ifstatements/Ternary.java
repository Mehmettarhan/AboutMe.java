package day10_Ifstatements;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String  result = "";

        if(num%2 ==0){
            result = "Even";
        }else{
            result = "Odd";
        }
        System.out.println(result);

        System.out.println("--------------------------------------------");

        String result2 = (num %2 ==0)? "Even" : "Odd";
        System.out.println(result2);

    }
}
