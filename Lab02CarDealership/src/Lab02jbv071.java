/*
 * Lab02jbv071.java
 * 
 * This is code to test adding to a basic car.
 * 
 * Using the decorator design pattern we can add to the  
 * car object at runtime while decoupling all of a car
 * add ons
 * 
 * @author Jonathan Vargas
 * @version 1.0.0 Feb 17, 2020
 */
public class Lab02jbv071 {

	public static void main(String[] args) {
		Car vroomVroom = new BasicCar();
		Car vroomVroom1 = new BasicCar();
		Car vroomVroom2 = new BasicCar();
		
		
		System.out.println("********");
		System.out.println("Now testing all additions:");
		vroomVroom = new SunRoof(vroomVroom);
		vroomVroom = new HeatedSeats(vroomVroom);
		vroomVroom = new RedRacingStripes(vroomVroom);
		vroomVroom = new LeatherSeats(vroomVroom);
		vroomVroom = new Spoilers(vroomVroom);
		System.out.println(vroomVroom.getInterioir());	
		System.out.println(vroomVroom.getExterior());
		System.out.println("Cost = $" + vroomVroom.getCost());
		
		System.out.println("********");
		System.out.println("Now testing 2 additions:");
		vroomVroom1 = new RedRacingStripes(vroomVroom1);
		vroomVroom1= new Spoilers(vroomVroom1);
		System.out.println(vroomVroom1.getInterioir());	
		System.out.println(vroomVroom1.getExterior());
		System.out.println("Cost = $" + vroomVroom1.getCost());
		
		System.out.println("********");
		System.out.println("Now testing 1 addition:");
		vroomVroom2 = new LeatherSeats(vroomVroom2);
		System.out.println(vroomVroom2.getInterioir());	
		System.out.println(vroomVroom2.getExterior());
		System.out.println("Cost = $" + vroomVroom2.getCost());
	}

}
