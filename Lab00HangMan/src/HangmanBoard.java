/**
 * HangmanBoard.java
 * 
 *This class handles the variables and the functions of a hangman game
 *
 * 
 * @author Jonathan Vargas
 * @version 1.0.0 Jan 31, 2020
 */
public class HangmanBoard {
	private String secretWord = "";
	private String boardWord ="";
	private int numOfTries;
	private String triedChars = "";

	public HangmanBoard() {
		numOfTries = 0;
		secretWord = "";
		triedChars ="";
		boardWord ="";
	}
	
	public HangmanBoard(int maxGuesses, String userWord) {
		numOfTries = maxGuesses;
		secretWord = userWord.toLowerCase();
		for (int i = 0; i < secretWord.length(); i++)
			boardWord += "*";
	}

	//checks if the user has re enters on of their guesses or if the char is in the secret word
	public boolean validateGuess(char guess)
	{
		String guessString = String.valueOf(guess); 
		guessString.toLowerCase();
		boolean correctGuess = secretWord.contains(guessString);

		if(triedChars.contains(guessString)) {
			numOfTries--;
			return false;
		}
		else if (!correctGuess)
		{
			numOfTries--; 
		}
		triedChars += guessString + ", ";
		this.updateBoard(correctGuess, guess);
		return correctGuess;
	}
	
	public boolean validateGuess(String guess)
	{
		boolean correctGuess = secretWord.equalsIgnoreCase(guess);
		if (!correctGuess)
		{
			numOfTries--; 
		}
		this.updateBoard(correctGuess, guess);
		return correctGuess;
	}
	
	private void updateBoard(boolean guessState, char userChar)
	{
		
		if (guessState)
		{
			//this loops through the string and find the chars that match in secretWord and replaces
			//the astrik in the current position as the user entered char.
			for (int i = 0; i < secretWord.length(); i++)
			{
				if ( secretWord.charAt(i) == userChar)
				{
					boardWord = boardWord.substring(0,i)+ userChar + boardWord.substring(i+1);
				}
			}
		}
		
		//this is ambiguous code
		//in theory after the astriks are removed by the algorithm above boardword == secretWord
		//It would compile the strings as 2 different strings
		//to remedy this i search boardWord if it stills contains astriks then assign boardWord as
		// secret word to communicate with my other functions
		if (!(boardWord.contains("*")))
		{
			boardWord = secretWord;
		}
	}
	
	private void updateBoard(boolean guessState, String guess) 
	{
		if (guessState)
		{
			boardWord = secretWord;
		}
	}
	
	
	public String getSecretWord()
	{
	return secretWord;
	}
	public int getNumOfTries()
	{
	return numOfTries;	
	}
	public String getBoardWord() 
	{
	return boardWord;
	}
	public String getTriedChars() 
	{
	return triedChars;
	}
	

}