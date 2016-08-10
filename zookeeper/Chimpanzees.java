package com.zookeeper;

public class Chimpanzees extends Primates {

	public Chimpanzees(String name, int age, String gender, String color, boolean adult, boolean alive,
			boolean carnivorous, String geographicHabitat, int numOffspring, boolean livesInTrees,
			boolean hasOpposableThumbs, boolean hasPrehensileTail, String socialStructure) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat, numOffspring, livesInTrees,
				hasOpposableThumbs, hasPrehensileTail, socialStructure);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chimpanzees [name=" + name + ", age=" + age + ", gender=" + gender + ", color=" + color + ", adult="
				+ adult + ", alive=" + alive + ", carnivorous=" + carnivorous + ", geographicHabitat="
				+ geographicHabitat + ", getNumOffspring()=" + getNumOffspring() + ", isLivesInTrees()="
				+ isLivesInTrees() + ", isHasOpposableThumbs()=" + isHasOpposableThumbs() + ", isHasPrehensileTail()="
				+ isHasPrehensileTail() + ", getSocialStructure()=" + getSocialStructure() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getColor()=" + getColor()
				+ ", isAdult()=" + isAdult() + ", isAlive()=" + isAlive() + ", isCarnivorous()=" + isCarnivorous()
				+ ", getGeographicHabitat()=" + getGeographicHabitat() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
