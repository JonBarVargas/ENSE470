package Tanks;

public class Tank1 extends Tank{
	
	
	
	public Tank1() {
		
		setName("Tank1");
		setDamage(10.0);
	}
	
	public void receiveHit(int damage, int penetration)
	{
		double shotDamage = 0.0;
		double shellPenetration = 0.0;
		
		if(destroyed)
		{
			System.out.println("I am dead..");
			return;
		}
		
		System.out.println("Received Hit..");
		//First check if the damage penetrates the armor.
		if( penetration > getArmor())
		{
				shellPenetration = penetration - getArmor();
				shellPenetration = shellPenetration / 100.0;
				
				shotDamage = (damage * shellPenetration);
				
				if(shotDamage >= currentHealth)
				{
					currentHealth = 0;
					destroyed = true;
					System.out.println("Tank Destroyed !!!");
				}
				else
				{
					currentHealth -= shotDamage;
				}
			
		}
		else
		{
			System.out.println("No penetration...");
		}
		
	}
	
	
	
	
	
}
