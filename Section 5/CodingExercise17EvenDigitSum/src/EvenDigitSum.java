public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int sum = 0;

        if(number < 0) {
            return -1;
        }

        while (number > 0) {
            int temp = number % 10;

            if(temp % 2 == 0){
                sum += temp;
            }

            number /= 10;
        }

        return sum;
    }
}
