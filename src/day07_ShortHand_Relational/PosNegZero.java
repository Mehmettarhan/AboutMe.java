package day07_ShortHand_Relational;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class PosNegZero {
    public static void main(String[] args) {
        int num = -100;
        boolean isPos = num >= 0;
        boolean isNeg = num < 0 ;
        boolean isZero = num == 0;
        // boolean is Zero = isNegative == false && isPos == FALSE;
        System.out.println(num+" is a pos num: "+ isPos);
        System.out.println(num+" is a neg num: "+ isNeg);
        System.out.println(num+" is zero: "+isZero);



    }
}
