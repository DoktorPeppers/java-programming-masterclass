import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        int counter = 0;
        while(true) {
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        average = sum/counter;

        System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(average));
    }
}
