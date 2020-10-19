public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int sum;
        int firstDigit = 0;
        int lastDigit = number % 10;

        if(number < 0){
            return -1;
        }

        while (number > 0){
            firstDigit = number % 10;
            number /= 10;
        }
        sum = firstDigit + lastDigit;
        return sum;
    }
}
