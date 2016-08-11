package com.zookeeper;

public class Animal {

	protected String name = null;
	protected int age = 0;
	protected String gender = null;
	protected String color = null;
	protected boolean adult = false;
	protected boolean alive = false;
	protected boolean carnivorous = false;
	protected String geographicHabitat = null;
	
	public Animal(String name, int age, String gender, String color, boolean adult, boolean alive, boolean carnivorous,
			String geographicHabitat) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
		this.adult = adult;
		this.alive = alive;
		this.carnivorous = carnivorous;
		this.geographicHabitat = geographicHabitat;
	}
	
	public void isAnAdult() {
		String isAnAdult; 
		if (adult = true) {
			isAnAdult = "an adult";
		} else {
			isAnAdult = "not an adult";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public boolean isCarnivorous() {
		return carnivorous;
	}

	public void setCarnivorous(boolean carnivorous) {
		this.carnivorous = carnivorous;
	}

	public String getGeographicHabitat() {
		return geographicHabitat;
	}

	public void setGeographicHabitat(String geographicHabitat) {
		this.geographicHabitat = geographicHabitat;
	}
	
	
	
}
	