package com.zookeeper;

public class BengalTigers extends Cats {

	public BengalTigers(String name, int age, String gender, String color, boolean adult, boolean alive,
			boolean carnivorous, String geographicHabitat, int numLimbs, boolean hasFur, boolean solitary,
			int numOffspring, boolean longHair, boolean scavenger) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat, numLimbs, hasFur, solitary, numOffspring,
				longHair, scavenger);
	}
	
	
	@Override
	public String toString() {
		
		return "This bengal tiger's name is " + name + ". It's a " + gender + " tiger, and is " + age + " years old."
				+ " It's coloration is " + color + ", and it's " ;
	}
	

}
