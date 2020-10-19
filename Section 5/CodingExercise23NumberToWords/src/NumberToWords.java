public class NumberToWords {

    public static void numberToWords(int number){
        int digits = getDigitCount(number);

        if(number < 0) {
            System.out.println("Invalid Value");
        }

        number = reverse(number);

        while(number > 0){
            int temp = number % 10;
            switch(temp){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Number");
                    break;
            }
            number /= 10;
            digits--;
        }

        if(digits > 0){
            while(digits > 0){
                System.out.println("Zero");
                digits--;
            }
        }
    }

    public static int reverse(int number){
        int temp = 0;
        int keep = number;

        while(number > 0){
            temp *= 10;
            temp += (number % 10);
            number = number / 10;
        }

        if(keep < 0) {
            temp *= -1;
        }

        return temp;
    }

    public static int getDigitCount(int number){
        int count = 0;

        if(number < 0)
            return -1;

        if(number == 0)
            return 1;

        while(number > 0){
            number /= 10;
            count++;
        }

        return count;
    }
}
