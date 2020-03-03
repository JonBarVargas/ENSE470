//This class is to implement the iterator needed to 
//iterate through the array of FlightTickets
//THis uses the Iterator desing pattern
import java.util.Iterator;
public class TicketIterator implements Iterator<FlightTicket>{
	public FlightTicket[] flights;
	
	
	public TicketIterator(FlightTicket[] flightsDatabase) {
		this.flights = flightsDatabase;
	}
	private int index = 0;
	
	@Override
	public boolean hasNext() {
		
		if (index < flights.length && flights[index] != null)
			return true;
		return false;
	}

	@Override
	public FlightTicket next() {
		if (this.hasNext())
			return flights[index++];
		return null;
	}
	

}