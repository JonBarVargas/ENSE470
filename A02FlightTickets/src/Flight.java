//This is the interface that the model
//(FlightTicket) inherets from it is also
//used a way to decorate the an object of
//FlightTicket using the decorator pattern
public interface Flight {
	public String getDepartureTime(); 
	public String getDepartureCity();
	public String getArrivalCity();
	public boolean getExtraLegroom();
	public boolean getInFlightMeals();
	public boolean getExcessBaggage();
	public int getPrice();
}
