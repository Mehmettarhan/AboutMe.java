package day11_Switch;

public class SwitchStatement2 {
    public static void main(String[] args) {
        String name = "firefox";

        switch (name){

            case "chrome":
                System.out.println("Chrome Browser is elected");
                 // case closed

            case "firefox":
                System.out.println("Firefox Browser is elected");
                break;


            case "edge":
                System.out.println("Edge Browser is elected");
                break;
            default:
                System.out.println("Invalid Browser");


        }


    }
}
