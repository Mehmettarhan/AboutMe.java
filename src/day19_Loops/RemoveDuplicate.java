package day19_Loops;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String word = "abacbababaebab";
        String result = ""; //ab

        for (int i = 0; i <= word.length() - 1; i++) { // i< word.length(); i++

            if (!result.contains("" + word.charAt(i))) {

                result += word.charAt(i);
            }


        }
        System.out.println("result= " + result);

    }
}
