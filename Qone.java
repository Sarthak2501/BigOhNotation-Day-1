import java.sql.SQLOutput;
import java.util.Locale;

public class Qone {
    public static Boolean isNameValid(String name) {
//        String vowel = "aeiou";
        int n = name.length();
        boolean isValid = true;
        for (int i = 0; i < n; i++) {
            if (name.charAt(i) == 'A' ) {
                isValid = false;
            }
            else if (name.charAt(i) == 'E') {
                isValid = false;
            }
            else if (name.charAt(i) == 'I') {
                isValid = false;
            }
            else if (name.charAt(i) == 'O') {
                isValid = false;
            }
            else if (name.charAt(i) == 'U') {
                isValid = false;
            }
        }
        int count = 0;
        for(int j = 0 ; j < n; j++) {

            if(name.charAt(j) == 'S'){
                count++;
            }
        }
//        System.out.println(count);
        if(count >= 2) {
            int pehla = name.indexOf('S', 0);
//            System.out.println(pehla);
            int dusra = name.indexOf('S', pehla + 1);
            //System.out.println(dusra);
            for (int k = pehla + 1; k < dusra; dusra++) {
                if (name.charAt(k) == 'T') {
                    //System.out.println("kuch bhi");
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }

    public static void main(String[] args) {

        boolean kyaNameSahiHai = isNameValid("pSSSTSk");

        System.out.println(new StringBuilder().append("Is the Name Valid : ").append(kyaNameSahiHai).toString());

    }
}