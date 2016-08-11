package com.zookeeper;

public class Orangutans extends Primates {

	public Orangutans(String name, int age, String gender, String color, boolean adult, boolean alive,
			boolean carnivorous, String geographicHabitat, int numOffspring, boolean livesInTrees,
			boolean hasOpposableThumbs, boolean hasPrehensileTail, String socialStructure) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat, numOffspring, livesInTrees,
				hasOpposableThumbs, hasPrehensileTail, socialStructure);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Orangutans [name=" + name + ", age=" + age + ", gender=" + gender + ", color=" + color + ", adult="
				+ adult + ", alive=" + alive + ", carnivorous=" + carnivorous + ", geographicHabitat="
				+ geographicHabitat;
	}

}
