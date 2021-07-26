package day18_Recap;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class StringMethodPractice {
    public static void main(String[] args) {

        String str="abcd";
        int indexOfK=str.indexOf("k");
        System.out.println("indexOfK= "+indexOfK);

        if(indexOfK>=0){
            System.out.println("The string has char k");
        }else {
            System.out.println("The string does not have k");
        }
        System.out.println("----------------------------------------");

        String sentence="I like to learn C#, C# is cool"; // verify if sentence has java

        if(sentence.indexOf("J")>=0){
            System.out.println("Sentence has java");
        }else {
            System.out.println("Sentence does not have java");
        }

        System.out.println("------------------------------------------");

        String sentence2= "I love Java, C# is cool.";
                     //           7     13
        boolean isUnique=sentence2.indexOf("Java")== sentence2.lastIndexOf("Java");
             //                     7             ==              7
        System.out.println("isUnique= "+isUnique);

        System.out.println("==============================================");

        String schoolName= "Cybertek School";
        String name= schoolName.substring(0, schoolName.indexOf(" "));
        System.out.println("name= "+name);

        String sentence3 ="' I live in Madison, I go to Cybertek School.";
        String name2 =sentence3.substring( sentence3.indexOf("Cy"), sentence3.lastIndexOf(" ") );
        System.out.println("name2= "+name2);

        System.out.println("=================================================");

        String str2= "dog cat dog cat";
        System.out.println(str2);
        str2= str2.replace("cat", "dog");
        System.out.println(str2);

        str2=str2.replaceFirst("dog", "cat");
        System.out.println(str2);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String sentence4= "Java Java Java";
        sentence4= sentence4.replace("Java Java",  "C# Python");
        System.out.println(sentence4);





    }
}
