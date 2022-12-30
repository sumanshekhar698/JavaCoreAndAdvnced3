package com.java.oops.inheritance;

//public final class Player  {//final class cannot be inherited
public class Player {
	String name;
	int age;
	float weight;
	float height;
	int jersey;

	public Player(String name, int age, float weight, float height, int jersey) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.jersey = jersey;
	}

	void sayMyName() {
		System.out.println(this.name);
	}

	private void tester() {// private entities cannot be inheritted
		System.out.println("TESTER");
	}

}
