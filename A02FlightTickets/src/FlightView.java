//A class to display the the model
import java.util.Iterator;

public class FlightView {
	public void displayFlights(FlightTicket[] qued) {
		TicketIterator iterator = new TicketIterator(qued);
		int i = 1;
		for (Iterator iter = iterator; iter.hasNext();) {
			FlightTicket flight = iterator.next();
			System.out.println("(" + i + ")" + 
								flight.getDepartureCity() + "  "+
								flight.getArrivalCity() + "  "+ 
								flight.getDepartureTime());
			i++;
		}
	}
	public void printUserFlight(Flight user) {
		System.out.println("Departure City : " + user.getDepartureCity());
		System.out.println("Arrival City : " + user.getArrivalCity());
		System.out.println("Time : " + user.getDepartureTime());
		System.out.println("Extra Legroom : " + user.getExtraLegroom());
		System.out.println("In-flight meals : " + user.getInFlightMeals());
		System.out.println("Excess Baggage : " + user.getExcessBaggage());
		System.out.println("Total Price : $" + user.getPrice());
	}
}
