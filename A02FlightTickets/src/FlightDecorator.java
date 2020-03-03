//This class allows A flight ticket to be add on extra elements
//or change elements during runtime
public class FlightDecorator implements Flight{
	protected Flight tempFlight; 
	
	public FlightDecorator(Flight newFlight) {
		tempFlight = newFlight;
	}

	public boolean getExtraLegroom() {
		return tempFlight.getExtraLegroom();
	}

	public boolean getInFlightMeals() {
		return tempFlight.getInFlightMeals();
	}

	public boolean getExcessBaggage() {
		return tempFlight.getExcessBaggage();
	}

	public int getPrice() {
		return tempFlight.getPrice();
	}

	public String getDepartureTime() {
		return tempFlight.getDepartureTime();
	}

	public String getDepartureCity() {
		return tempFlight.getDepartureCity();
	}

	public String getArrivalCity() {
		return tempFlight.getArrivalCity();
	}

}
