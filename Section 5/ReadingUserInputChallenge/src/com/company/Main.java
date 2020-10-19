package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(counter <= 10){
            System.out.println("Enter number #" + counter + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
               System.out.println("Invalid number");
            }

            scanner.nextLine();
        }
        scanner.close();

        System.out.println("The sum of the 10 numbers is " + sum);
    }
}
