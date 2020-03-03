
public class HeatedSeats extends CarDecorator{

	public HeatedSeats(Car newCar) {
		super(newCar);
		System.out.println("Warming seats...");
	}
	public String getInterioir() {
		return tempCar.getInterioir() +", heated seats";
	}
	public double getCost() {
		return tempCar.getCost() + 200;
	}
	

}
