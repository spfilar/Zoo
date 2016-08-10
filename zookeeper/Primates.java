package com.zookeeper;

public class Primates extends Animal {
	
	private int numOffspring = 0;
	private boolean livesInTrees = false;
	private boolean hasOpposableThumbs = false;
	private boolean hasPrehensileTail = false;
	private String socialStructure = null;
	
	public Primates(String name, int age, String gender, String color, boolean adult, boolean alive,
			boolean carnivorous, String geographicHabitat, int numOffspring,
			boolean livesInTrees, boolean hasOpposableThumbs, boolean hasPrehensileTail, String socialStructure) {
		super(name, age, gender, color, adult, alive, carnivorous, geographicHabitat);
		this.numOffspring = numOffspring;
		this.livesInTrees = livesInTrees;
		this.hasOpposableThumbs = hasOpposableThumbs;
		this.hasPrehensileTail = hasPrehensileTail;
		this.socialStructure = socialStructure;
	}

	public int getNumOffspring() {
		return numOffspring;
	}

	public void setNumOffspring(int numOffspring) {
		this.numOffspring = numOffspring;
	}

	public boolean isLivesInTrees() {
		return livesInTrees;
	}

	public void setLivesInTrees(boolean livesInTrees) {
		this.livesInTrees = livesInTrees;
	}

	public boolean isHasOpposableThumbs() {
		return hasOpposableThumbs;
	}

	public void setHasOpposableThumbs(boolean hasOpposableThumbs) {
		this.hasOpposableThumbs = hasOpposableThumbs;
	}

	public boolean isHasPrehensileTail() {
		return hasPrehensileTail;
	}

	public void setHasPrehensileTail(boolean hasPrehensileTail) {
		this.hasPrehensileTail = hasPrehensileTail;
	}

	public String getSocialStructure() {
		return socialStructure;
	}

	public void setSocialStructure(String socialStructure) {
		this.socialStructure = socialStructure;
	}
	
}
