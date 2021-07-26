package day34_LocalDayTime_Wrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {

        short s= 10;
        int number=s;
        Integer number2= (int)s; // Autoboxing : converting primitive value to wrapper class value

        char ch='@';
        Character ch2 = (Character) ch;  // Autoboxing

        Byte b1= 10;
        byte b2= b1; // unboxing
        short b3= b1; // unboxing
        int b4= b1; // unboxing
        long b5= b1; // unboxing
        float b6= b1; // unboxing
        double b7= b1; // unboxing

        System.out.println("---------------------------------------------------");

        byte c1= 10;
        Byte c2= c1;
      //  Short c3= c1; // short wrapper class only accepts short primitive




    }
}
