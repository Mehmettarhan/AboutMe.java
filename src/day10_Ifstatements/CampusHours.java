package day10_Ifstatements;

public class CampusHours {
    public static void main(String[] args) {
        int time =7;
        if (time >= 8 && time<= 23){
            System.out.println("open");
        }else{
            System.out.println("Closed");
        }



    }
}
/*
1. Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not.
            Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message: “open”
            but if the time entered is outside of operating hours they should see: “ closed”

2. Write a program that can calculate the salary after tax based on the following requirements.
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax, otherwise pays 5% extra tax

    3. Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number
    and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

            output:
                FIN

                number = 10

            output:
                RA

                number = 15

            output:
                FINRA
 */