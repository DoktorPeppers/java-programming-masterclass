package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
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

        int highScorePosition = calculateHighScorePosition(15000);
        displayHighScorePosition("Radi", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Jim", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Alex", highScorePosition);


    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
         return -1;
    }

    public static void displayHighScorePosition(String Player1, int highScorePosition){
        System.out.println(Player1 + " managed to get into position " + highScorePosition
        + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500 && playerScore < 1000){ // because playerScore will ALWAYS be < 100
            // if we have reached this part of the code, '&& playerScore < 1000' is redundant
            return 2;
        }else if(playerScore >=100 && playerScore < 500){ // same here
            return 3;
        }else{ //this else is also not needed
            return 4;
        }

        /*int position = 4;

        if(playerScore >= 1000){
            position = 1;
        } else if (playerScore >=500){
            position = 2;
        } else if (playerScore >=100){
            position = 3;
        }
        return position;

        //this is also a viable method
        */
    }
}
