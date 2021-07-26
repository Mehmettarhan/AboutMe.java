package day15_String;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word1= "Muhtar";
        char ch1=word1.charAt(0);

        System.out.println("ch1= "+ch1);

        String word2= "Java";
        char  ch3= word2.charAt(2);
        System.out.println("ch3= "+ch3);

        String sentence="Hello people, how are you all today?";
        int totalNumberOfChars=sentence.length();
        System.out.println("totalNumberOfChars= "+totalNumberOfChars);

        String s1 = "Cybertek";
        //index: 01234567
        int lastIndex= s1.length()-1;
        char firstCharacter=s1.charAt(0);
        char lastCharacter= s1.charAt(lastIndex);

        System.out.println("firstCharacter= "+firstCharacter);
        System.out.println("lastCharacter= "+lastCharacter);

        System.out.println("====================================");

        String s2= "JAVA PROGRAMING LANGUAGE";
        s2=s2.toLowerCase(); // java programing language
        System.out.println(s2);
        System.out.println("====================================");

        String name ="mehmet";
               name=name.toUpperCase(); // MEHMET
        System.out.println(name);

        System.out.println("--------------------------------------");

        String schoolName= "           Cybertek School     ";
        schoolName=schoolName.trim(); // "Cybertek School"
        System.out.println(schoolName);



    }
}
