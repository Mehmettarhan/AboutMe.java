package officeHours.Practice_06_09_2021.StringPractice;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class StringIntro {
    public static void main(String[] args) {

        String s1="Java";
        String s2="Java";
        String s3="Java";
        String s4="JAVA";
        System.out.println("==operator");
        System.out.println(s1==s2); //T
        System.out.println(s1==s3); //T
        System.out.println(s1==s4); //F

        System.out.println("==================================");

        System.out.println("equals()");
        System.out.println(s1.equals(s2)); //T
        System.out.println(s1.equals(s3)); //T
        System.out.println(s1.equals(s4)); //F
        System.out.println(s1.equalsIgnoreCase(s4)); //true

    }
}
