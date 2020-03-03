/**
 * A02jbv071.java
 * 
 *A Flight ticket reservation System
 *
 *This program utilizes the decorator, MVC, and iterator design
 *pattern to display flights based on a search query and add
 *extra add ons to the user's flight
 *
 *This class uses TicketController to modify the model which is an array
 *of FlightTicket.
 * 
 * @author Jonathan Vargas
 * @version 1.0.0 Feb 29, 2020
 */
import java.util.Iterator;
import java.util.Scanner;

public class A02jbv071 {

	public static void main(String[] args) {
		
		//flight database
		FlightTicket[] flights = new FlightTicket[3];
		flights[0]= new FlightTicket("Regina", "Vancouver", "0900H", 300);
		flights[1]= new FlightTicket("Regina", "Vancouver", "1500H", 350);
		flights[2]= new FlightTicket("Regina", "Toronto", "1300H", 500);
		
		FlightView view = new FlightView();
		TicketController controller = new TicketController(flights, view);
		Scanner userInput = new Scanner(System.in);
		
		
		
		String userDepart = "";
		String userArrive = "";
		
		System.out.print("Enter Departure City: ");
		userDepart = userInput.nextLine();
		System.out.print("Enter Arrival City: ");
		userArrive = userInput.nextLine();
		controller.searchFlights(userDepart, userArrive);
		
		
		int userChoice;
		System.out.println("Which flight do you want? ");
		userChoice = userInput.nextInt();
		controller.chooseFlight(userChoice);
		
		
		boolean extraLegroom = false;
		boolean inFlightMeals = false;
		boolean excessBaggage = false;
		String userAns;
		System.out.println("Do you want to add extra legroom seats (Y/N)?");
		userAns = userInput.next();
		if(userAns.contains("Y"))
		{
			extraLegroom = true;
		}
		System.out.println("Do you want to add in-flight meals (Y/N)?");
		userAns = userInput.next();
		if(userAns.contains("Y"))
		{
			inFlightMeals = true;
		}
		System.out.println("Do you want to add excess baggage (Y/N)?");
		userAns = userInput.next();
		if(userAns.contains("Y"))
		{
			excessBaggage = true;
		}
		controller.addOn(excessBaggage, extraLegroom, inFlightMeals);
		
		
		
		System.out.println("Your final flight information is : ");
		controller.displayUserFlight();
		userInput.close();
	
	}
}