package Chapter5;

import java.util.*;

//System.out.println("working");
//An important bug that might exist is if the player puts a space inbetween the integers inputed it might causes issues with the input stream.
//That might need to be fixed if it is true

//there may be a bug with if a guess is equal.
//I haven't tested it and I haven't thought about it too much


//Need to do
//{
//Make sure the player is guessing valid numbers
//Make sure the answer is within the correct interval
//}

//Make a way to get the guesses beyond the first one if it is incorrect.

//Fun things to do later
//make sure the players are entering integers.
//clear the console after the initial answer is inputed so that player 2 can't see the answer

public class Game
{
    public static void main(String[] args) {
        int answer = -2;
        int guess1 = -1;
        int guess2 = -1;
        int numGuess = 1;

        Scanner scan = new Scanner(System.in);
        //The while loops make sure that an integer between 0 and 100 both inclusive is entered
        while(!(answer<=100&&answer>=0))
        {
            System.out.println("Player 1 please input an integer between 0 and 100");
            answer = scan.nextInt();
        }
        while(!(answer<=100&&answer>=0))
        {
            System.out.println("Player 2 please input your guess.  It must be an integer between 0 and 100");
            guess1 = scan.nextInt();
        }


        while (guess1 != answer)
        {
            if (answer > guess1)
            {
                System.out.println("You guess is lower than the correct number..");
                System.out.println("Please make a guess that is higher than " + guess1 + " and less than or equal to 100");
                guess2 = scan.nextInt();
                //Make a condition for if it is equal to the previous guess

                while(guess2<=guess1)
                {
                    if(guess1==guess2)
                    {
                        System.out.println("Please enter a number that is larger than your previous guess of  " + guess1);
                        guess2 = scan.nextInt();
                    }else
                    {
                        System.out.println("You're guess is not larger than the one before this.  Please enter a larger integer than " + guess1);
                        guess2 = scan.nextInt();
                    }

                }
                guess1 = guess2;
            }
            if (answer < guess1)
            {
                System.out.println("Your guess was higher than the correct number.");
                System.out.println("Please make a guess that is lower than " + guess1 + " and greater than or equal to 0");
                guess2 = scan.nextInt();
                //Make a condition for if it is equal to the previous guess
                while(guess2>=guess1)
                {
                    if(guess1==guess2)
                    {
                        System.out.println("Please enter a number that is smaller than your previous guess of  " + guess1);
                        guess2 = scan.nextInt();
                    }else
                    {
                        System.out.println("You're guess is not smaller than the one before this.  Please enter an integer smaller than " + guess1);
                        guess2 = scan.nextInt();
                    }
                }
                guess1 = guess2;
            }

            //this assignment may have been redundant, but I will keep it here just in case it isn't and I was mistaken
            //guess2 = -1;//this resets guess2 so that it wont be equal to guess1 on the next pass if there is one
            numGuess++;
        }
        System.out.println("That is the correct number.");
        //Might want to add logic in the future to make guesses plural or singular based on the number of guesses it took to get the right answer.
        if(numGuess>1)
        {
            System.out.println("It took you " + numGuess + " guesses to get the correct number.");
        }else
        {
            System.out.println("It took you " + numGuess + " guess to get the correct number.");
        }

    }

}


