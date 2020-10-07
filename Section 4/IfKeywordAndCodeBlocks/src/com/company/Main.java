package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        /*if(score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000");
        }else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }*/

        if(gameOver == true){ // if(gameOver) - abbreviation
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        //int savedFinalScore = finalScore; //in the above if statement, after the code has finished
        //it will delete andy and all variables in the code block, the reverse is not true.

        boolean isDead = true;
        int scored = 10000;
        int completedLevels = 8;
        int bonusModifier = 200;

        if(isDead){
            int finalScore = scored + (completedLevels * bonusModifier);
            System.out.println("Your final score is " + finalScore);
        } //while correct, this creates new variables which take up more memory,
        // instead you acn use the same variables
        //but change the numbers, which will use less memory, the disadvantage of this is that
        //there is no way to make sure that the old values are stored, plus there is duplicated code
        //which can be forgotten if something else is changed in the first iteration of the code
    }
}
