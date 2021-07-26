package day15_String;

import java.util.Locale;

public class StringMethod2 {
    public static void main(String[] args) {

        String sentence ="Java programing language"; // index: 0123
        String name= sentence.substring(0,4);
        System.out.println(name);

        String s2="Webster University";
        String name2=s2.substring(0,11+1);
        System.out.println(name2);

        String name3 =s2.substring(8,17);
        System.out.println(name3);

        System.out.println("===============================");

        String sentence2= "Java is a programing language";
        String name4= sentence2.substring(10);
        System.out.println(name4);

        String name5 = sentence2.substring(10,20);
        System.out.println(name5);

        System.out.println("==============================");

        String sentence3 ="Python is an easy language";
        sentence3=sentence3.replace("Python", "Java");
        System.out.println(sentence3);

        String sentence4 = "C# is a programing language, I like C#.";
        sentence4= sentence4.replace("C#","Java");
        System.out.println(sentence4);

        System.out.println("-------------------------------------");
        // summary
        String str="Batch 23";
        // index: 01234567
        char ch1=str.charAt(2);
        System.out.println("ch1= "+ch1); // the smallest index num is 0. You cannot give negative num.

        str=str.toLowerCase();
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);

        String str2="Cybertek is a great school.";
        String s4=str2.substring(14,19);
        System.out.println(s4);
    }
}
