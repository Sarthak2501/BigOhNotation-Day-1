public class Qfive {

    public static void main(String[] args) {

        int n ;
        boolean isDivisible = true;

        for (n = 10; n < 300000; n++) {

            for (int i = 1; i <= 9 ; i++) {
                if (n % i != 0) {
                    isDivisible = false;
                    break;
                } else {
                    isDivisible = true;
                }
            }
            if (isDivisible)
                break;
        }
        if (isDivisible) {
            System.out.println(n);
        }
    }
}

