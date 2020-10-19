package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1234;
        System.out.println("The digit sum of " + a + " is " + sumDigits(a));
    }

    public static int sumDigits(int number){
        int sum = 0;

        if(number < 10){
            return -1;
        }

        while (number > 0){
            int n = number % 10;
            sum = sum + n;
            number = number / 10;
        }

        return sum;
    }
}
