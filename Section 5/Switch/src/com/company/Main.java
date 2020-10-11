package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if(value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 41;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break; //breaks are important!

            default:
                System.out.println("Was not 1 or 2");
                break;// this is the last line of the code block,
            // so this 'break' is not actually needed
            //but it's good practice to have it
        }

    }
}
