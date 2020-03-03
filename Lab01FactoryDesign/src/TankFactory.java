
public class TankFactory {
	
	public Tank makeNewTank(String tankTypes) {
		Tank testTank = null;
		tankTypes = tankTypes.toLowerCase();
		if (tankTypes.equals("cunningham")) {
			testTank = new T1Cunningham();
		}else
		if(tankTypes.equals("crusader")) {
			testTank = new Crusader();
		}else
		if(tankTypes.equals("nameless")) {
			testTank = new TheNameless();
		}else
		if(tankTypes.equals("yazi")) {
			testTank = new Yazi();
		}
		else
		if(tankTypes.equals("renault")) {
			testTank = new Renault();
		}
		return testTank;
	}
}
