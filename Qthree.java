public class Qthree {

    public static int firstDigit(int num){
        while (num >= 10){
            num = num/10;
        }
        return num;
    }

    static boolean isPrime(int n)
    {

        if (n <= 1)
            return false;


        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public static String largestPrime(int num){
        int digitCount  = (int)Math.log10(num);
        int k = 1;
        String humaraNumber = "";
        while (k <= digitCount + 1){
            int primedigit = 0;
            int singledigit = num % 10;
            if(singledigit == 0){
                primedigit = 7;
            }
            for(int i = singledigit - 1 ; i > 0 ; i--){
                if (isPrime(i)){
                    primedigit = i;
                    break;
                }
            }
            humaraNumber = primedigit + humaraNumber;
            k++;
            num = num / 10;
        }
    return humaraNumber;

    }

    public static void main(String[] args) {
        String ans2 = largestPrime(495);
        System.out.println(ans2);
    }
}


