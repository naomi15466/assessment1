package com.gnome;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        // getting input from user//
        Scanner scan = new Scanner(System.in);

        // create players
        int humanPlay;
        int computerPlay;

        // number of rounds that user wants to play
        System.out.println("How many rounds would you like to play? (1-10)");
        int numOfRounds = scan.nextInt();
        if (numOfRounds < 1 || numOfRounds > 10) {        // if number inputted is out of bounds
            System.out.println("Error! Please input a number between 1-10!");
            System.exit(0);
        }


        // keep track of score (update after each round) //
        int tie = 0;
        int humanWin = 0;
        int computerWin = 0;

        // REMINDER: Rock = 1, Paper = 2, Rock = Scissors
        while (true) {  // use while so that we can iterate through all again if user decides to play again
            for (int i = 0; i < numOfRounds; i++) {
                // call option for user to choose
                option();
                humanPlay = scan.nextInt();
                computerPlay = randomCPU();

                if (humanPlay == computerPlay) {
                    tie++;
                    System.out.println("Tie!");
                } else if (humanPlay == 1 && computerPlay == 2) {     // human player chooses rock
                    computerWin++;
                    System.out.println("Paper beats rock. Computer player wins!");
                } else if (humanPlay == 1 && computerPlay == 3) {
                    humanWin++;
                    System.out.println("Rock beats scissors. Human player wins!");
                } else if (humanPlay == 2 && computerPlay == 1) {      // human player chooses paper
                    humanWin++;
                    System.out.println("Paper beats rock! Human player wins!");
                } else if (humanPlay == 2 && computerPlay == 3) {
                    computerWin++;
                    System.out.println("Scissors beats paper! Computer player wins!");
                } else if (humanPlay == 3 && computerPlay == 1) {      // human player chooses scissors
                    computerWin++;
                    System.out.println("Rock beats scissors. Computer player wins!");
                } else if (humanPlay == 3 && computerPlay == 2) {
                    humanWin++;
                    System.out.println("Scissors beats paper. Human player wins!");
                }
            }

            // Print out the score after all rounds completed
            System.out.println("Human player score: " + humanWin);
            System.out.println("Computer player score: " + computerWin);
            System.out.println("Tied round: " + tie);

            // Compare score to determine winner
            if (humanWin < computerWin) {
                System.out.println("Computer player wins!");
            } else if (humanWin > computerWin) {
                System.out.println("Human player wins!");
            } else {
                System.out.println("It's a tie!!!");
            }
            // ask play if they want to play again
            System.out.println("Do you want to play again? (Y/N)");
            String in = "";
            in = scan.next();
            if (in.equals("Y")) {
                continue;
            } else {
                System.out.println("\nEnd of game!");
                break;
            }

        }
        scan.close();
    }

    // have user choose between rock, paper, scissors
    private static void option() {
        System.out.println("Choose an option:");
        System.out.println("1: Rock, 2: Paper, 3: Scissors");
    }

    // creating computer player's move//
    private static int randomCPU() {
        Random random = new Random();
        int compInput = 1 + random.nextInt(3-1+1);      // set random generator bound
                                                            // return min + random.nextInt(max - min +  1)
        return compInput;
    }
}
