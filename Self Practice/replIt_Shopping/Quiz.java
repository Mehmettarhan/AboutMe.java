package replIt_Shopping;

public class Quiz {
    public static void main(String[] args) {
        double pi = 3.14;
        boolean b = 119 % 5 == 0;
        int n = 0;
        if (pi > 3.14 && !b) {
            n += 50;

        } else {
            n -= 50;
        }
        if (b) {
            n += 50;
        }
        System.out.println(n);
        System.out.println("===================");
        double d = 13.20;
        int w = d < 20 ? 20 : 10;
        System.out.println(w);

    }
}
