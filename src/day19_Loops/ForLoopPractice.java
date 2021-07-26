package day19_Loops;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i=0; i<=100; i++){ // i represent: 0,1,2,3,4,5,.............999,1000.
            if(i %2 !=0){
                System.out.print(i+" ");
            }
            System.out.println(); // to make sure next statement starts from new line
            System.out.println("--------------------------------------------------");

            for (int j = 1; j < 101; j++) {
                if(j%2==0){
                    System.out.print(j+" ");
                }

            }


        }
    }
}
