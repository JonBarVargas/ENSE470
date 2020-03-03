/*
 * This class is to handle any request
 * made by the user or other classes
 */
import java.util.Iterator;

public class TicketController {
	private FlightTicket[] flightDatabase;
	private FlightTicket userTicket; //model
	private FlightView ticketView;
	private FlightTicket[] quedFlights;
	private Flight finalFlight;
	
	
	public TicketController(FlightTicket[] flights, FlightView view) {
		flightDatabase = flights;
		ticketView = view;
		quedFlights = new FlightTicket[flights.length];
	}
	public void searchFlights(String depart, String arrive) {
		int i = 0;
		TicketIterator iterator = new TicketIterator(flightDatabase);
		for (Iterator iter = iterator; iter.hasNext();) {
			FlightTicket testFlight = iterator.next();
			if(arrive.equals(testFlight.getArrivalCity()) && depart.equals(testFlight.getDepartureCity()))
			{
				quedFlights[i] = testFlight;
				i++;
			}
		}
		ticketView.displayFlights(quedFlights);
	}
	
	public void chooseFlight(int choice) {
		userTicket = quedFlights[choice - 1];
	}
	
	public void addOn(boolean excessBaggage, boolean extraLegroom, boolean inFlightMeals) {
		finalFlight = new FlightTicket();
		finalFlight = userTicket;

		
		if(excessBaggage) {
			finalFlight = new ExcessBaggage(finalFlight);
		}
		if(extraLegroom) {
			finalFlight= new ExtraLegroom(finalFlight);
		}
		if(inFlightMeals) {
			finalFlight= new InFlightMeals(finalFlight);
		}
	}
	
	public void displayUserFlight() {
		ticketView.printUserFlight(finalFlight);
	}
	
	
	
	
	
	
	
	
	
}
