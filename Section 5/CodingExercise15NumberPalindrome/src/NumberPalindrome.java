public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }

        int reverse = 0;
        int lastDigit;
        int num = number;
        while (number > 0){
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }
        return num == reverse;
    }
}
