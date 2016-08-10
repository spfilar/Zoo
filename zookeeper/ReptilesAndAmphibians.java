package com.zookeeper;

public class ReptilesAndAmphibians extends Animal {
	
	protected boolean isReptile = false;
	private boolean hasShell = false;
	private boolean livesOnLand = false;
	private int numLimbs = 0;
	private int numEggs = 0;
	private boolean venomous = false;
	
	public ReptilesAndAmphibians(String name, int age, String gender, String color, boolean adult, boolean alive,
			boolean carnivorous, String geographicHabitat, boolean isReptile, boolean hasShell,
			boolean livesOnLand, int numLimbs, int numEggs, boolean venomous) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat);
		this.isReptile = isReptile;
		this.hasShell = hasShell;
		this.livesOnLand = livesOnLand;
		this.numLimbs = numLimbs;
		this.numEggs = numEggs;
		this.venomous = venomous;
	}

	public boolean isReptile() {
		return isReptile;
	}

	public void setReptile(boolean isReptile) {
		this.isReptile = isReptile;
	}

	public boolean isHasShell() {
		return hasShell;
	}

	public void setHasShell(boolean hasShell) {
		this.hasShell = hasShell;
	}

	public boolean isLivesOnLand() {
		return livesOnLand;
	}

	public void setLivesOnLand(boolean livesOnLand) {
		this.livesOnLand = livesOnLand;
	}

	public int getNumLimbs() {
		return numLimbs;
	}

	public void setNumLimbs(int numLimbs) {
		this.numLimbs = numLimbs;
	}

	public int getNumEggs() {
		return numEggs;
	}

	public void setNumEggs(int numEggs) {
		this.numEggs = numEggs;
	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}
	
}