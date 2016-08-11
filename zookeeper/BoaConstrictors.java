package com.zookeeper;

public class BoaConstrictors extends ReptilesAndAmphibians {

	@Override
	public String toString() {
		return "BoaConstrictors [isReptile=" + isReptile + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", color=" + color + ", adult=" + adult + ", alive=" + alive + ", carnivorous=" + carnivorous
				+ ", geographicHabitat=" + geographicHabitat;
	}

	public BoaConstrictors(String name, int age, String gender, String color, boolean adult, boolean alive,
			boolean carnivorous, String geographicHabitat, boolean isReptile, boolean hasShell, boolean livesOnLand,
			int numLimbs, int numEggs, boolean venomous) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat, isReptile, hasShell, livesOnLand,
				numLimbs, numEggs, venomous);
		// TODO Auto-generated constructor stub
	}
	
}
