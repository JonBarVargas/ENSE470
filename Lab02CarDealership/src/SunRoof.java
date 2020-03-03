
public class SunRoof extends CarDecorator {

	public SunRoof(Car newCar) {
		super(newCar);
		System.out.println("Adding Sunroof...");
		
	}
	public String getExterioir() {
		return tempCar.getExterior() + ", Sunroof";
	}
	public double getCost() {
		return tempCar.getCost() + 199.99;
	}
}
