
public class Spoilers extends CarDecorator {

	public Spoilers(Car newCar) {
		super(newCar);
		System.out.println("Adding spoilers for aerodynamic purposes...");
	}
	public String getExterioir() {
		return tempCar.getExterior() + ", rear spoiler";
	}
	public double getCost() {
		return tempCar.getCost() + 79.50;
	}
}
