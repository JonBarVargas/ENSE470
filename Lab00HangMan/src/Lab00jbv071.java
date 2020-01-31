
public class Lab00jbv071 {

	public static void main(String[] args) {
		HangmanBoard boi = new HangmanBoard(5, "yeeyeet");
		
		//boi.displayBoard();
		//boi.enterLetter('y');
		
		String myName = "domanokz";
		String newName = myName.substring(0,4)+'x'+myName.substring(5);
		System.out.println(newName);
	}

}
