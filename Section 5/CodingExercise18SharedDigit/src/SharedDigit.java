public class SharedDigit {

    public static boolean hasSharedDigit(int a,int b) {
        if(a < 10 || a > 99 || b < 10 || b > 99){
            return false;
        }
        
        int temp1 = a % 10;
        int temp2 = b % 10;

        a /= 10;
        b /= 10;

        return temp1 == temp2 || a == b || temp1 == b || temp2 == a;
    }
}
