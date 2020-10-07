package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // a statement is the entire line
        myVariable++;
        myVariable--;
        System.out.println("This is a test"); // All of lines from here and above are statements

        System.out.println("This is" +
                " another" +
                " still more");  //this is an entire single statement cuz Java is smort
        int anotherVariable = 5; myVariable--; //this works but it's not recommended cuz it can get confusing

        int yetAnotherVariable = 500; //Java doesn't care for spaces, white space (racist but ok)
    }
}
