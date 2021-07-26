package day19_Loops;

public class From80To20 {
    public static void main(String[] args) {

        for (int i = 80; i >= 20; i -= 2){
            if (i > 20){
                System.out.print(i+" ");
            }else{
                System.out.print(i);
            }
        }
    }
}
