package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (){
        System.out.println("No player name, no player Score");
        return 0;
    }

    public static void calculateScore (String playerName, int score){
        //changing the data type is not enough
        //to make this a viable method for method overloading (does not change the overall signature),
        //the number of parameters needs to be changed for it to be viable
        System.out.println("Player " + playerName + " scored " + score + " points");
    }
}
