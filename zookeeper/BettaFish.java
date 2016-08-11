package com.zookeeper;

public class BettaFish extends Fish {

	public BettaFish(String name, int age, String gender, String color, boolean adult, boolean alive,
			boolean carnivorous, String geographicHabitat, int numEggs, int numFins, boolean saltWater,
			boolean scales) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat, numEggs, numFins, saltWater, scales);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BettaFish [name=" + name + ", age=" + age + ", gender=" + gender + ", color=" + color + ", adult="
				+ adult + ", alive=" + alive + ", carnivorous=" + carnivorous + ", geographicHabitat="
				+ geographicHabitat;
	}

}
