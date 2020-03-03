//This Class is used to add on to the users
//Flight with InFlightMeals
public class InFlightMeals extends FlightDecorator {
	public InFlightMeals(Flight newFlight) {
	super(newFlight);
	}
	public boolean getInFlightMeals() {
		return true;
	}
	public int getPrice() {
		return tempFlight.getPrice() + 10;
	}
	
}
