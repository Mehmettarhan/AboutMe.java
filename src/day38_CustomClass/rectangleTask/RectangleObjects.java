package day38_CustomClass.rectangleTask;

import day38_CustomClass.rectangleTask.Rectangle;

import java.util.Arrays;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

       /*
        rectangle1.width =30;
        rectangle1.length=20;
         */
        rectangle1.setInfo(30,20); // set length and width to calculate area and perimeter of rectangle

        //rectangle1.getInfo();
        System.out.println(rectangle1);

        System.out.println("-------------------------------------------------------");

        Rectangle rectangle2 = new Rectangle(); // each object has their own INSTANCE values
        rectangle2.setInfo(50,20);
        //rectangle2.getInfo();
        System.out.println(rectangle2);

        System.out.println("------------------------------------------------------");

        System.out.println(rectangle1); // because of not having "toString" method in the "rectangle class"
        System.out.println(rectangle2);  // you will get hashcode Rectangle@61bbe9ba

        System.out.println("=======================================================");

        Rectangle [] arr = {rectangle1, rectangle2};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr));

    }
}
