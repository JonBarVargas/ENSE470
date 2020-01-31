public class HangmanBoard {
	protected String secretWord = "";
	protected String boardWord ="";
	protected int numOfTries;
	protected String triedChars = "";


	public HangmanBoard() {
		numOfTries = 0;
		
	}
	//done
	public HangmanBoard(int maxGuesses, String userWord) {
		numOfTries = maxGuesses;
		secretWord = userWord;
		for (int i = 0; i < secretWord.length(); i++)
			boardWord += "*";
	}
	//done
	public String getSecretWord()
	{
	return secretWord;
	}
	
	public void displayBoard() {
		System.out.print("The word to guess is: ");
		System.out.println(boardWord);
		System.out.println("You have " + numOfTries + " guesses left");
	}
	
	public void enterLetter(char guess) {
		boolean correctGuess = false;
		String guessString = String.valueOf(guess); 
		correctGuess = secretWord.contains(guessString);
		
		System.out.println(secretWord.contains(guessString));
	}
	private void updateBoard(boolean guessState, char userChar)
	{
		for (int i = 0; i < secretWord.length(); i++)
		{
			if ( secretWord.charAt(i) == userChar)
			{
				//boardWord.setCharAt
			}
		}
	}
	

}