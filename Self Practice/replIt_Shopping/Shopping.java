package replIt_Shopping;
import java.util.Scanner;

public class Shopping {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter the item1 and its price:");
            String item1=scan.next();
            double price1=scan.nextDouble();
            System.out.println("Enter the item2 and its price:");
            String item2=scan.next();
            double price2=scan.nextDouble();
            System.out.println("Enter the item3 and its price:");
            String item3=scan.next();
            double price3=scan.nextDouble();

            double totalPrice=price1+price2+price3;


            System.out.println("item1: "+item1+" price: "+price1+", item2: "+item2+" price: "+price2
                    +", item3: "+item3+" price: "+price3+"\n"+"Total price: "+totalPrice);

        }
    }

