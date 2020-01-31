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
	
	//done
	public HangmanBoard(int maxGuesses, String userWord) {
		numOfTries = maxGuesses;
		secretWord = userWord.toLowerCase();
		for (int i = 0; i < secretWord.length(); i++)
			boardWord += "*";
	}
	
	//done
	public String getSecretWord()
	{
	return secretWord;
	}
	
//	public String getDisplayBoardWord() {
	//return boardWord;
	//}
	
	public void enterLetter(char guess) {
		char ch1 = Character.toLowerCase(guess);
		this.validateGuess(ch1);
	}
	private void validateGuess(char guess)
	{
		boolean correctGuess = false;
		String guessString = String.valueOf(guess); 
		correctGuess = secretWord.contains(guessString);
		System.out.println(secretWord.contains(guessString));
	}
	public void validateGuess(String guess)
	{
		
		//guess.toLowerCase();
		System.out.println(secretWord.equalsIgnoreCase(secretWord));
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