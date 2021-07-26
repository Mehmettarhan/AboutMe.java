package day19_Loops;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class EnglishAlphabet {
    public static void main(String[] args) {

        for (int i = 65; i <= 91; i++) {
            System.out.println( (char)i+" ");

        }
        System.out.println();

        System.out.println("==========================================");

        for (char i = 'A'; i <='Z' ; i++) {
            System.out.print(i+" ");
            System.out.print("----------------------------------------");


        }
    }
}
