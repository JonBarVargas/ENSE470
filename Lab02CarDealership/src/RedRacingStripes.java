
public class RedRacingStripes extends CarDecorator{
	public RedRacingStripes(Car newCar) {
		super(newCar);
		System.out.println("Adding red racing stripes "
				+ "to make the car vroom vroom faster...");
	}
	public String getExterior() {
		return tempCar.getExterior() + ", red racing stripes";
	}
	public double getCost() {
		return tempCar.getCost() + 59.99;
	}
}