
public class AssemblerRobot extends Robot {
	static AssemblerRobot theInstance = new AssemblerRobot();
	private AssemblerRobot() {
		
	}
	public static AssemblerRobot getInstance() {
		return theInstance;
	}

}
