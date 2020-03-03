
public class CarDecorator implements Car {

	protected Car tempCar;

	public CarDecorator(Car newCar) {
		tempCar = newCar;
	}
	public String getInterioir() {
		return tempCar.getInterioir();
	}
	
	public String getExterior() {
		return tempCar.getExterior();
	}

	public double getCost() {
		
		return tempCar.getCost();
	}
	
}
