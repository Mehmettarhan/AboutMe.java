package day14_Recap;

import java.util.Scanner;

public class TernaryPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1~7:");
        int number = scan.nextInt();

        String name=(number>=1 && number<=7)?
                (number==1)? "Mon":(number==2)?"Tue":(number==3)?"Wed"
                        :(number==4)?"Thu" :(number==5)?"Fri":(number==6)?"Sat":"Sun"
              : "No such a day";

        System.out.println("----------------------------------------------------");

        String name2="";
        if (number>=1 && number<=7){

            switch (number){

                case 1:name2 = "Mon"; break;
                case 2:name2="Tue"; break;
                case 3:name2="Wed"; break;
                case 4:name2="Thu"; break;
                case 5:name2="Fri"; break;
                case 6:name2="Sat"; break;

                default:
                    name2="Sun";
            }


        }else{
            name2="No such a day";
        }
        System.out.println("name2= "+name2);

    }
}
