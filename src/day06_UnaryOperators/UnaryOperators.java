package day06_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {
      int a = 100;
      ++a;
        System.out.println("a=" +a);
        int w = 110;
        --w;
        System.out.println("w=" +w);
        System.out.println("---------------------");

        int n1 = 50;
        int n2 = n1++; // n2= 50+1=51
        System.out.println("n1="+n1); // change value by 1
        System.out.println("n2="+n2);

        // unary operator +: positive // -: NEGATIVE // ++: INCREMENT // --: DECREMENT
        // PRE: Change the value by 1 immediately
        // post: pass it as it is, then change it by 1.

        System.out.println("----------------------");
        int r = 200;
        System.out.println(r++); //200 delay
        System.out.println("r="+ r); //201
        int p = 200;
        System.out.println(++p);
        System.out.println("p="+ p);

        System.out.println("---------------");
        int y = 100;
        int result= y++ +1;
        System.out.println("y = "+ y);
        System.out.println("result= "+ result);



    }
}
