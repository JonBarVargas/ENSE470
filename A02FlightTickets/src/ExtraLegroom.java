//This Class is used to add on to the users
//Flight with Extra Legroom
public class ExtraLegroom extends FlightDecorator {
	public ExtraLegroom(Flight newFlight) {
		super(newFlight);
		}
		public boolean getExtraLegroom() {
			return true;
		}
		public int getPrice() {
			return tempFlight.getPrice() + 10;
		}
		
}
