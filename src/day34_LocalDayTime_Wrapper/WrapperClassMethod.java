package day34_LocalDayTime_Wrapper;

import day10_Ifstatements.CampusHours;

public class WrapperClassMethod {
    public static void main(String[] args) {

        String str = "123";
        int num = Integer.valueOf(str); //unboxing
                   // wrapper class


        int num1 = Integer.parseInt(str); // autoboxing

        int num2= Integer.parseInt(str);

        Integer num3 = Integer.valueOf(str);
        System.out.println(num-1);

        String str2= "true";
        boolean r1 = Boolean.parseBoolean(str2);

        boolean r2= Boolean.valueOf(str2);

        boolean r3 = Boolean.parseBoolean(str2);
        System.out.println(r1);

        System.out.println("-------------------------------");
        String s2= "1a2b3c";
        int sum =0;
        for (char each :s2.toCharArray() ){
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println("sum= "+sum);

        System.out.println("-----------------------------------------");

        String s3 = "AAABBBCCC1@#$%";
        String letters="",
                digits="",
                specialChars="";
        for (char each: s3.toCharArray()){
            if(Character.isDigit(each)){
                digits+=each;
            }else if(Character.isLetter(each)){
                letters+=each;
            }else {
                specialChars+=each;
            }
        }
        System.out.println(letters);
        System.out.println(specialChars);
        System.out.println(digits);


    }
}
