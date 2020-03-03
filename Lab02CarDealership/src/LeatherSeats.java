
public class LeatherSeats extends CarDecorator{

	public LeatherSeats(Car newCar) {
		super(newCar);
		System.out.println("Lining car with leather...");
	}
	public String getInterioir() {
		return tempCar.getInterioir() + ", leather seats";
	}
	public double getCost() {
		return tempCar.getCost() + 200;
	}
}
