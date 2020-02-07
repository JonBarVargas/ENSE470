
public class TankFactory {
	
	public Tank makeNewTank(String newShipTypes) {
		Tank testTank = null;
		if (newShipTypes.contentEquals("yeet")) {
			testTank = new T1Cunningham();
		}
		return testTank;
	}
}
