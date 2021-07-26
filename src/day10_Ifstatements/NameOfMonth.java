package day10_Ifstatements;

public class NameOfMonth {
    public static void main(String[] args) {
        int number = 13; // 1~12
        String name = "";

        if(number>=1 && number<=12) {


            if (number == 1) {
                name = "Jan";
            } else if (number == 2) {
                name = "Feb";
            } else if (number == 3) {
                name = "Mar";
            } else if (number == 4) {
                name = "Apr";
            } else if (number == 5) {
                name = "May";
            } else if (number == 6) {
                name = "Jun";
            } else if (number == 7) {
                name = "Jul";
            } else if (number == 8) {
                name = "Aug";
            } else if (number == 9) {
                name = "Sep";
            } else if (number == 10) {
                name = "Oct";
            } else if (number == 11) {
                name = "Nov";
            } else {
            }
            System.out.println("name = " + name);
        }else{
            name = "Such a Month not valid.";
            System.out.println("name = " + name);
        }




    }
}
