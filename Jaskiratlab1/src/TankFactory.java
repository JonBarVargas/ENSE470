package Tanks;

public class TankFactory {
	
	
	public Tank createTank(String newTankType) {
		
		Tank newTank = null;
		
		if(newTankType.equals("Tank1"))
		{
            return new Tank1();
        }
		
        else if(newTankType.equals("Tank2"))
        {
             return new Tank2();
        }
		
        else if(newTankType.equals("Tank3"))
        {
             return new Tank3();     
        }
		
        else if(newTankType.equals("Tank4"))
        {
             return new Tank4();
        }
		
        else if(newTankType.equals("Tank5"))
        {
             return new Tank5();
        }

		return newTank;



	}

}
