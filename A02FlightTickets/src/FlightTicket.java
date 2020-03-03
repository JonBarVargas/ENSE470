/**
 * FlightTicket.java
 * 
 * This is the Model that the controller will
 * modify.
 *
 *The system will handle a array of FlightTickets
 *to simulate a database
 * @author Jonathan Vargas
 * @version 1.0.0 Feb 29, 2020
 */
public class FlightTicket implements Flight {
	private String departureCity ="";
	private String arrivalCity ="";

	private String departureTime;
	private int price;
	
	private boolean extraLegroom;
	private boolean inFlightMeals;
	private boolean excessBaggage;
	
	public FlightTicket(){
		departureCity ="N/A";
		arrivalCity = "N/A";
		departureTime = "N/A";
		price = 0;
	}
	public FlightTicket(String departCity, String arriveCity, String departTime, int cost) {
		departureCity = departCity;
		arrivalCity = arriveCity;
		departureTime = departTime;
		price = cost;
	}
	
	public String getDepartureTime() {
		return departureTime;
	}

	public int getPrice() {
		return price;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	
	public boolean getExtraLegroom() {
		return extraLegroom;
	}

	public boolean getInFlightMeals() {
		
		return inFlightMeals;
	}
	
	public boolean getExcessBaggage() {
		
		return excessBaggage;
	}
	
}
