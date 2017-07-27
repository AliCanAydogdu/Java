import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess;       
        int guess;            //The user's guess
	int numGuesses;       //Number of guesses
	int tooHigh;          //Number of too high guesses
	int tooLow;           //Number of too low guesses

	Random generator = new Random();
	Scanner scan = new Scanner (System.in);

	numToGuess = generator.nextInt(10) + 1;

	System.out.println("I'm thinking of a number!!");
	System.out.print("Enter your guess: ");

	//read in guess
	guess = scan.nextInt();

	numGuesses = 1;
	tooHigh = 0;
	tooLow = 0;

	while (guess != numToGuess  )  //keep going as long as the guess is wrong
        {
	    numGuesses++;
	    if (guess > numToGuess)
		{
		    System.out.print("Too high, guess again: ");
		    tooHigh++;
		}
	    else
		{
		    System.out.print("Too low, guess again: ");
		    tooLow++;
		}
	    guess = scan.nextInt();
	}

	if (numGuesses == 1)
	    System.out.println ("You got it, after only one guess!!");
	else
	    System.out.println("You got it, after only " + numGuesses + " guesses!!");

	if (tooHigh == 1)
	    System.out.println(tooHigh + " guess was too high.");
	else
	    System.out.println(tooHigh + " guesses were too high.");

	if (tooLow == 1)
	    System.out.println(tooLow + " guess was too low.");
	else
	    System.out.println(tooLow + " guesses were too low.");


    }
}
