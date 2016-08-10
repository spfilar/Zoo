package com.zookeeper;

public class Fish extends Animal {
	
	private int numEggs = 0;
	private int numFins = 0;
	private boolean saltWater = false;
	private boolean scales = false;
	
	public Fish(String name, int age, String gender, String color, boolean adult, boolean alive, boolean carnivorous,
			String geographicHabitat, int numEggs, int numFins, boolean saltWater, boolean scales) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat);
		this.numEggs = numEggs;
		this.numFins = numFins;
		this.saltWater = saltWater;
		this.scales = scales;
	}

	public int getNumEggs() {
		return numEggs;
	}

	public void setNumEggs(int numEggs) {
		this.numEggs = numEggs;
	}

	public int getNumFins() {
		return numFins;
	}

	public void setNumFins(int numFins) {
		this.numFins = numFins;
	}

	public boolean isSaltWater() {
		return saltWater;
	}

	public void setSaltWater(boolean saltWater) {
		this.saltWater = saltWater;
	}

	public boolean isScales() {
		return scales;
	}

	public void setScales(boolean scales) {
		this.scales = scales;
	}
	
}