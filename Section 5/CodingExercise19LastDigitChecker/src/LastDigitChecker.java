public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a,int b,int c) {
        if(a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000){
            return false;
        }

        int temp1 = a % 10;
        int temp2 = b % 10;
        int temp3 = c % 10;

        return temp1 == temp2 || temp1 == temp3 || temp2 == temp3;
    }

    public static boolean isValid(int a) {
        if(a < 10 || a > 1000){
            return false;
        }

        return true;
    }
}
