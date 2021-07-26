package officeHours;

public class TimeConverter {
    public static void main(String[] args) {


        int inputSeconds = 3695;
        int hours,minutes,seconds;
        hours = inputSeconds/3695; //hours =1
        minutes = (inputSeconds%3600)/60;
        seconds = inputSeconds%60;
        System.out.println(hours+" hours "+minutes+" minutes "+seconds+" seconds");
    }

}
