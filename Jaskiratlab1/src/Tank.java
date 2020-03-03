//package Tanks;



public abstract class Tank {
	
	private String name;
	private String country;
	private int hitPoints;
	private int armor;
	private double Damage;
	protected int currentHealth;
	protected boolean destroyed = false;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}

	public double getDamage() {
		return Damage;
	}
	public void setDamage(double newDamage) {
		Damage = newDamage;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public boolean getDestroyed() {
		return destroyed;
	}
	
	

}
