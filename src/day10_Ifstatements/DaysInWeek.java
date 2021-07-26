package day10_Ifstatements;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 5; //1~7
        String name = "";

        if (number>=1 && number<=7) {


            if (number == 1) {
                name = "Mon";
            } else if (number == 2) {
                name = "Tue";
            } else if (number == 3) {
                name = "Wed";
            } else if (number == 4) {
                name = "Thu";
            } else if (number == 5) {
                name = "Fri";
            } else if (number == 6) {
                name = "Sat";
            } else {
                name = "Sunday";
            }

        }else {

            name = (number==1)? "Mon":(number==2)?"Tue":(number==3)?"Wed":(number==4)?"Thur"
                    :(number==5)?"Fri":(number==6)?"Sat":"Sunday";
            name = "No such a day";
            System.out.println("name = " + name);
        }


    }
}
