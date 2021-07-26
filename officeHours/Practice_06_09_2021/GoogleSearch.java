package officeHours.Practice_06_09_2021;

public class GoogleSearch {
    public static void main(String[] args) {

        String result= "About 640,000,000 results (0.78 seconds)";

        int startIndex=result.indexOf(" ");
        int endindex=result.indexOf(" r");

        System.out.println(startIndex);
        System.out.println(endindex);

        String searchResult=result.substring(startIndex+1,endindex);
        System.out.println("searchResult= "+searchResult);

        int firstIndex=result.indexOf("(");
        int lastIndex=result.indexOf(")");

        System.out.println("lastIndex= "+lastIndex);

    }
}
/*
Task 3 : Assume that you searched a word in Google  Search Engine.After that you took a result message like          this


                         "About 640,000,000 results (0.78 seconds)"

                         According to this result print out search Time and number of Result

                         Input :  "About 640,000,000 results (0.78 seconds)"

                         Output:
                                     Result number is 640,000,000
                                     Response time is 0.78 seconds
 */