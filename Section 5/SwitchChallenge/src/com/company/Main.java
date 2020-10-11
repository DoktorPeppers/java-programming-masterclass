package com.company;

public class Main {

    public static void main(String[] args) {
        char character = 'a';
        switch(character) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("You said " + character);
                break;

            default:
                System.out.println("Nothing found");
                break;
        }

        String month = "January"; // Beware! If you type in 'january'
        //with different letters than the 'case' in the 'switch'
        //it will not work if you don't use the a class
        //like '.toLowerCase' or '.toUpperCase'
        switch (month.toLowerCase()){
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
