//This Class is used to add on to the users
//Flight with Excess Baggage
public class ExcessBaggage extends FlightDecorator {
	public ExcessBaggage(Flight newFlight) {
		super(newFlight);
		}
		public boolean getExcessBaggage() {
			return true;
		}
		public int getPrice() {
			return tempFlight.getPrice() + 20;
		}
}
