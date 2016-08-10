package com.zookeeper;

public class Cats extends Animal {
	
	private boolean hasFur = false;
	private boolean solitary = false;
	private int numOffspring = 0;
	private boolean longHair = false;
	private boolean scavenger = false;
	
	public Cats(String name, int age, String gender, String color, boolean adult, boolean alive, boolean carnivorous,
			String geographicHabitat, int numLimbs, boolean hasFur, boolean solitary,
			int numOffspring, boolean longHair, boolean scavenger) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat);
		this.hasFur = hasFur;
		this.solitary = solitary;
		this.numOffspring = numOffspring;
		this.longHair = longHair;
		this.scavenger = scavenger;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	public boolean isSolitary() {
		return solitary;
	}

	public void setSolitary(boolean solitary) {
		this.solitary = solitary;
	}

	public int getNumOffspring() {
		return numOffspring;
	}

	public void setNumOffspring(int numOffspring) {
		this.numOffspring = numOffspring;
	}

	public boolean isLongHair() {
		return longHair;
	}

	public void setLongHair(boolean longHair) {
		this.longHair = longHair;
	}

	public boolean isScavenger() {
		return scavenger;
	}

	public void setScavenger(boolean scavenger) {
		this.scavenger = scavenger;
	}


}
