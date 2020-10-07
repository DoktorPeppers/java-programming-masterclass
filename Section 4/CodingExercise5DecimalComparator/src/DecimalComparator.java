public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo){
        double a = numberOne * 1000;
        double b = numberTwo * 1000;
        int c = (int) (a - b);
        if (c == 0){
            return true;
        }
        return false;
    }
}
