package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println("10000 at 2% interest = " + calculateInterest(10000.0,2.0));
        //System.out.println("10000 at 3% interest = " + calculateInterest(10000.0,3.0));
        //System.out.println("10000 at 4% interest = " + calculateInterest(10000.0,4.0));
        //System.out.println("10000 at 5% interest = " + calculateInterest(10000.0,5.0));
        //This works, but programmers are lazy so this is not recommended

        //for(int i = 0; i < 5; i++) { //for(init; termination; increment)
        //    System.out.println("Loop " + i + " hello!");
        //}
        //init - the code that is initialized once at the start of the loop
        //termination - tells the 'for' loop when and how to exit (uses 'false')
        //Example (int i = 0; i < 5; i++), the loop will continue until 'i < 5',
        //after that it will break as the termination is no longer 'true' (it is 'false')
        //increment - invoked every time the loop goes around

        for(int a = 2; a < 9; a++){
            System.out.println("10000 at " + a + "% interest = "
                    + String.format("%.2f",calculateInterest(10000,a)));
        }

        for(int a = 8; a > 1; a--){
            System.out.println("10000 at " + a + "% interest = "
                    + String.format("%.2f",calculateInterest(10000,a)));
        }
    }
    public static double calculateInterest(double amount,double interestRate){
        return(amount * (interestRate / 100));
    }
}
