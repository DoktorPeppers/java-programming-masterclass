package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int brk = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                sum = sum + i;
                System.out.println("This number is divisible by 3 and 5 - " + i);
                brk++;
            }
            if(brk == 5){
                break;
            }
        }
        System.out.println("The sum of the numbers that are divisible by 3 and 5 is " + sum);
    }
}
