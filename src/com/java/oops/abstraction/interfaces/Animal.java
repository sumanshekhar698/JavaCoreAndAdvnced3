package com.java.oops.abstraction.interfaces;

public class Animal extends WildAnimals implements AnimalFood, AnimalSound {
	@Override
	public void speak() {
	}

	@Override
	public void eat() {
	}
}

interface AnimalSound {
	void speak();
}

interface AnimalFood {
	void eat();
}

class WildAnimals {
	void getListOfWildAnimals() {
		System.out.println("Wild animals are dabngerous");
	}
}
