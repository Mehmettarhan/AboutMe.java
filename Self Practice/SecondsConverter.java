import java.util.*;
public class SecondsConverter {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter seconds:");

                int inputSeconds = scan.nextInt(), hours, minutes,seconds;
                hours = inputSeconds/3600;
                minutes = (inputSeconds%3600)/60;
                seconds = inputSeconds%60;

                System.out.println(hours+" hours, "+minutes+" minutes, "+"and "+seconds+" seconds");

    }
}
