package day11_Switch;

public class PassOrFail {
    public static void main(String[] args) {

        char grade = 'D';   // pass A, B, C, D      fail: F

        switch (grade){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("PASSED");
                break;

            case 'F':
                System.out.println("FAILED");
                break;
        }

    }
}
