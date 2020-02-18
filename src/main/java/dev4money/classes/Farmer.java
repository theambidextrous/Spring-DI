package dev4money.classes;

public class Farmer {
	private int NumberOfAnimals;
	
	public void setNumberOfAnimals(int numberOfAnimals) {
		NumberOfAnimals = numberOfAnimals;
	}

	public void ShowFarmerWealth() {
		System.out.println("The farmer is wealthy, S/he has " + NumberOfAnimals + " animals");
	}
}
