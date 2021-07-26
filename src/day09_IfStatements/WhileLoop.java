package day09_IfStatements;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class WhileLoop {
    public static void main(String[] args) {

        String str= "cybertek";

        for (int i = 0; i <=str.length() ; i+=2) {
            //word+=str.charAt(i);
            System.out.print(str.charAt(i));
        }
        //System.out.println(str.charAt(i));

    }
}