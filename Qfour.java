public class Qfour {
    public static Boolean isValidURL(String url) {
////        //The URL must start with either http or https and
////        //then followed by :// and
////        //then it must contain www. and
////
////        //last part contains top level domain like .com, .org
////        // Java program to check URL is valid or not
        int n = url.length();
        boolean isValid1 = false;
        String firsthead = url.substring(0, 8);
        System.out.println(firsthead);
        if (firsthead.equals("https://") || firsthead.equals("http://")) {
            isValid1 = true;

        }
        String tail = url.substring(8);
        System.out.println(tail);
        String tail1 = tail.substring(0, 4);
//            System.out.println(tail1);
        if (tail1.equals("www.")) {
            isValid1 = true;
            }
        String tail2 = tail.substring(11);
//          System.out.println(tail2);
        if (tail2.equals(".com") || tail2.equals(".org") || tail2.equals(".in")){
                isValid1 = true;
            }

        return isValid1;
    }


    public static void main(String[] args) {
        Boolean answer = isValidURL("https://www.Sarthak.com");
        System.out.println(answer);
    }
}