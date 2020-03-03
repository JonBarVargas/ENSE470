package Tanks;

import java.util.Scanner;

public class L01josan20j {
	
	public static void main(String[] args){
		
		TankFactory tankfactory = new TankFactory();
		
		Tank theTank = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to 'World of Tanks'!\n");
		System.out.println("\n Choose a tank [Tank1/Tank2/Tank3/Tank4/Tank5]:");
		
		if(userInput.hasNextLine()){
			
			String whichTank = userInput.nextLine();
			theTank = tankfactory.createTank(whichTank);
		}
		

		
	}

}
