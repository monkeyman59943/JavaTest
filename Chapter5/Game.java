package Chapter5;

import java.util.*;

//System.out.println("working");
//An important bug that might exist is if the player puts a space inbetween the integers inputed it might causes issues with the input stream.
//That might need to be fixed if it is true

//Need to do
//Make sure the player is guessing valid numbers
//Make sure the answer is within the correct interval
//Make a way to get the guesses beyond the first one if it is incorrect.

//Fun things to do later
//make sure the players are enteting integers.
//clear the console after the initial answer is inputed so that player 2 can't see the answer

public class Game
{
    public static void main(String[] args) {
        int answer = -2;
        int guess1 = -1;
        int guess2 = -1;
        int numGuess = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1 please input an integer between 0 and 100");
        answer = scan.nextInt();

        System.out.println("Player 2 please input your guess.  It must be an integer between 0 and 100");
        guess1 = scan.nextInt();
        while (guess1 != answer)
        {
            if (answer > guess1)
            {
                System.out.println("your guess was too low.");
                System.out.println("Please make a guess that is higher than " + guess1 + "and less than or equal to 100");

            }
            if (answer < guess1)
            {
                System.out.println("your guess was too high.");
                System.out.println("Please make a guess that is lower than " + guess1 + "and greater than or equal to 0");
            }
            numGuess++;
        }
        System.out.println("That is the correct number.");
        //Might want to add logic in the future to make guesses plural or singular based on the number of guesses it took to get the right answer.
        System.out.println("It took you " + numGuess + " guesses to get the correct number.");


    }

}


