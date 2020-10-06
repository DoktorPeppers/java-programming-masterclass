package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstNumber = 20.00d;
	    double secondNumber = 80.00d;
	    double Combination = firstNumber + secondNumber * 100.00d; // if firstNumber and secondNumber are in a () the answer becomes different
        System.out.println(Combination);
	    double Remainder = Combination % 40.00d;
        System.out.println(Remainder);
	    boolean firstBoolean = (Remainder == 0) ? true : false;
        System.out.println(firstBoolean);
        if(!firstBoolean){
            System.out.println("Got some Remainder");
        }
    }
}
