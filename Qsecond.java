public class Qsecond {

    public static int firstDigit(int num){
        while (num >= 10){
            num = num/10;
        }
        return num;
    }
    public static int lastDigit(int num){
        num = num%10;
        return num;
    }



    public static int swapaNumber(int num){

        int pehlaDigit = firstDigit(num);
        int lastDigit = lastDigit(num);
        int digitsCount = (int) Math.log10(num);
        int swappedNum = lastDigit;
        swappedNum *= (int) Math.pow(10, digitsCount);
        swappedNum += num % ((int) Math.pow(10, digitsCount));
        swappedNum -= lastDigit;
        swappedNum += pehlaDigit;
        return swappedNum;
    }

    public static void main(String[] args) {
        int ans = swapaNumber(5471);
        System.out.println(ans);
    }
}
