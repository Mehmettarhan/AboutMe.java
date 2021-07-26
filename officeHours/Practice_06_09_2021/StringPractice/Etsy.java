package officeHours.Practice_06_09_2021.StringPractice;

public class Etsy {
    public static void main(String[] args) {
        String url="https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";

        int startIndex=url.indexOf(" c/");
        int endIndex=url.indexOf("?");

        String categoryName=url.substring(startIndex+2);
        System.out.println("categoryName= "+categoryName);

        categoryName.replace("-","");

        if(categoryName.contains("/")){
            categoryName=categoryName.substring(0,categoryName.indexOf("/"));
        }


    }
}
/*
Task 4 : Assume that you searched a baby toy in Etsy.When you open related category your url is :

             "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
                                                    (main category)

                         According to this result print out main category name

              Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049

                         Output:
                                     Main Category name is  toys and games

                         Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
                                                              (main category)

                         Output:
                                     Main Category name is  toys and entertainment
 */