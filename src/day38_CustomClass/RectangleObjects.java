package day38_CustomClass;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

       /*
        rectangle1.width =30;
        rectangle1.length=20;
         */
        rectangle1.setInfo(30,20); // set length and width to calculate area and perimeter of rectangle

        rectangle1.getInfo();

        System.out.printf("-------------------------------------------------------");

        Rectangle rectangle2 = new Rectangle(); // each object has their own INSTANCE values
        rectangle2.setInfo(50,20);
        rectangle2.getInfo();

    }
}
