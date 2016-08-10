package com.zookeeper;

public class Cobras extends ReptilesAndAmphibians {

	public Cobras(String name, int age, String gender, String color, boolean adult, boolean alive, boolean carnivorous,
			String geographicHabitat, boolean isReptile, boolean hasShell, boolean livesOnLand, int numLimbs,
			int numEggs, boolean venomous) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat, isReptile, hasShell, livesOnLand,
				numLimbs, numEggs, venomous);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cobras [isReptile=" + isReptile + ", name=" + name + ", age=" + age + ", gender=" + gender + ", color="
				+ color + ", adult=" + adult + ", alive=" + alive + ", carnivorous=" + carnivorous
				+ ", geographicHabitat=" + geographicHabitat + ", isReptile()=" + isReptile() + ", isHasShell()="
				+ isHasShell() + ", isLivesOnLand()=" + isLivesOnLand() + ", getNumLimbs()=" + getNumLimbs()
				+ ", getNumEggs()=" + getNumEggs() + ", isVenomous()=" + isVenomous() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getColor()=" + getColor()
				+ ", isAdult()=" + isAdult() + ", isAlive()=" + isAlive() + ", isCarnivorous()=" + isCarnivorous()
				+ ", getGeographicHabitat()=" + getGeographicHabitat() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
