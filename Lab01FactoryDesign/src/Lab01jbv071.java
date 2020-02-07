/*
 * Lab01jbv071.java
 * 
 * This is code to test 5 different tanks
 * 
 * Using the factory method tanks are being made during 
 * run time and we test the tanks durability by firing
 * at it
 * 
 * @author Jonathan Vargas
 * @version 1.0.0 Feb 07, 2020
 */
import java.util.Scanner;

public class Lab01jbv071 {

	public static void main(String[] args) {
		
		final int TESTROUNDS = 5;
		Scanner userInput = new Scanner(System.in);
		String tankType = "";
		TankFactory testFactory = new TankFactory();
		
		for(int i = 1; i <= TESTROUNDS; i++) {
			Tank tester = null;
			System.out.println("Round " + i);
			System.out.println("Please enter what kind of tank you would like to test: ");
			System.out.println("Cunningham, Crusader, Nameless, Yazi, Renault");
			
			if (userInput.hasNextLine()) {
				tankType = userInput.nextLine();
				tester = testFactory.makeNewTank(tankType);
				if (tester != null) {
					testTheTank(tester, i);
				}
			}
		}
	}
	
	//This function displays the tanks info and shoots the tank by an arbriturary 
	//amount of shots and rounds
	public static void testTheTank(Tank userTank, int modifier) {
		//The modifiers are meant to increase the difficulty of the 
		//test based on what round it is
		final int TESTSHOT = 70*modifier;
		final int TESTPENETRATION = 55*modifier;
		final int SHOOTROUNDS = 3+modifier;
		
		System.out.println("Tank name: " + userTank.getName());
		System.out.println("Country: " + userTank.getCountry());
		System.out.println("Max HP: " + userTank.getHitPoints());
		System.out.println("Armor: " + userTank.getArmor());
		System.out.println("Shell Damage: " + userTank.getShellDamage());
		
		System.out.println("");
		System.out.println("Test shot damage: " + TESTSHOT);
		System.out.println("Test shot penetration: " + TESTPENETRATION);
		System.out.println("");
		
		for(int i = 1; i <= SHOOTROUNDS; i++) {
		System.out.println("Firing missle "+ i + "...");
		userTank.receiveHit(TESTSHOT, TESTPENETRATION);
		System.out.println("Tank HP: " + userTank.getCurrentHealth());
		}
	}
}