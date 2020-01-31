/**
 * Lab00jbv071.java
 * 
 *This is a build of a game of hangman using the
 *built HangmanBoard class
 *
 *player 1 gives the program a word that player 2 must 
 *guess through guessing letters or the word
 * 
 * @author Jonathan Vargas
 * @version 1.0.0 Jan 31, 2020
 */

import java.util.Scanner;

public class Lab00jbv071 {


	
	public static void main(String[] args) {
		String user1Word = "";
		int numOfLives = 5;
		int userChoice;
		
		boolean winGame = false;
		boolean validUserChoice = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to hangman!");
		System.out.println("Player 1 please enter your secret word");
		user1Word = input.nextLine();
		
		for (int i = 0; i<= numOfLives; i++)
		{
			System.out.println("********************");
		}
	    HangmanBoard newGame = new HangmanBoard(numOfLives, user1Word);
	    
	    //round structure
	    // 1. displays the players status in the game
	    // 2. displays the choices the user can enter
	    // 3. processes the players status
	    // 4. checks if the user is out of tries or guessed the word
		while ((newGame.getNumOfTries() != 0) && !winGame)
		{
			while(!validUserChoice)
			{
				System.out.println("The word is: " + newGame.getBoardWord());
				System.out.println("You have " + newGame.getNumOfTries() + " tries remaining");
				System.out.println("You have tried these characters: " + newGame.getTriedChars());
				System.out.println("Player 2, you have two choices:");
				System.out.println("Enter 1 to guess a letter.");
				System.out.println("Enter 2 to guess the word ");
			
				userChoice = input.nextInt();
				
				switch(userChoice)
				{
				case 1: validUserChoice = true;
						enterLetter(newGame); 
						break;
				case 2: validUserChoice = true;
						enterWord(newGame); break;
				default: System.out.println("This is an incorrect input please try again");
				}
			}
			validUserChoice = false;
			if (newGame.getBoardWord() == newGame.getSecretWord()) {
				winGame = true;
				System.out.print("you got it! the word was: " + user1Word);
			}
			if (newGame.getNumOfTries() == 0) {
				System.out.println("sorry it you ran out of lives");
			}
			
		}
		
	}
	
	/**
	 * This function takes in the users word and checks if the secret word matches
	 */
	static void enterWord(HangmanBoard game)
	{
		Scanner input = new Scanner(System.in);
		String user2GuessStr = "";
		user2GuessStr = input.nextLine();
		game.validateGuess(user2GuessStr);
		boolean valid = game.validateGuess(user2GuessStr);
		if(!valid)
		{
			System.out.println("Sorry the secret word is not " + user2GuessStr);
		}
	}
	
	/**
	 * This function takes in the users letter and checks if it matches with any of the letters 
	 * in the secret word
	 */
	static void enterLetter(HangmanBoard game)
	{
		Scanner input = new Scanner(System.in);
		char user2GuessCha;
		System.out.println("Please enter a letter:");
		user2GuessCha = input.next().charAt(0);
		boolean valid = game.validateGuess(user2GuessCha);
		if (valid) {
			System.out.println("There is a " + user2GuessCha);
		}
		else
		{
			System.out.println("Oops try again");
		}
	}
	
	

}
