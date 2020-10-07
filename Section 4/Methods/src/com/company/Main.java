package com.company;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true,800,5,100);
        System.out.println("Your final score is " + highScore);


        highScore = calculateScore(true,10000,8,200);
        System.out.println("Your final score is " + highScore);

        /*boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score is " + highScore);

        This is also a viable method (pun not intended?) to use instead of the online 6 and 7
         */

    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
        // the 'void' keyword (public static void) means that no information is sent back,
        // while the keyword 'int' (void static int) does return information
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            // System.out.println("Your final score was " + finalScore);
            return finalScore; //the return keyword, sends back the expression to the original sender
        } else {
            return -1;
        }

        // return -1;
        //instead of using else, only using 'return -1;', will work
        //as it will not be executed if the 'if' is true, only when it is false
        // side note, we are returning '-1' (negative one),
        // as it is considered an indication of an error
    }
}
