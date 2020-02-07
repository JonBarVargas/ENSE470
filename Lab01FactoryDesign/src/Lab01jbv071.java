
public class Lab01jbv071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TankFactory yeetFactory = new TankFactory();
		
		
		Tank tester = null;
		tester = yeetFactory.makeNewTank("yeet");
		System.out.println(tester.getCountry());
	}
}