package day16_String;

public class WebName {
    public static void main(String[] args) {

        String url = "www.cybertek.gov";

        int beginning = url.indexOf(".")+1;
        int end =  url.lastIndexOf(".");

        String name = url.substring( beginning, end );
        String domain = url.substring( end + 1 );
        System.out.println(name);
        System.out.println(domain);

        System.out.println("_----------------------------------------------_");
        String str1= "Cat";
        String str2 = new String("Cat"); // Java Heap

        System.out.println(str1==str2);
        System.out.println( str1.equals(str2) );
        System.out.println("+++++++++++++++++++++++++++++++");
        String str3= "Java";
        String str4= "java";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
