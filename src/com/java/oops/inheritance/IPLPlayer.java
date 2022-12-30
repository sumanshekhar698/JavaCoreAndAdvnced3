package com.java.oops.inheritance;

//child extends parent
public class IPLPlayer extends Player {// Multiple inheritance is not possible in Java

	int runs;
	int age = -1;
	int wickets;
	boolean isAllrounder;

	public IPLPlayer(String name, int age, float weight, float height, int jersey, int runs, int wickets,
			boolean isAllrounder) {
		super(name, age, weight, height, jersey);
		this.runs = runs;
		this.wickets = wickets;
		this.isAllrounder = isAllrounder;
//		this.age = age;
	}

	@Override
	public String toString() {
		return "IPLPlayer [runs=" + runs + ", wickets=" + wickets + ", isAllrounder=" + isAllrounder + ", name=" + name
				+ ", age=" + age + ", weight=" + weight + ", height=" + height + ", jersey=" + jersey + "]";
	}

//	void sayMyName() {//inherited

	@Override
	void sayMyName() {// Overidden methods
		System.out.println("IPL PLAYER " + this.name);

	}

	void tellTheWickets() {// Special method
		System.out.println("WICKETS" + this.wickets);
	}

	void sayMyAge() {
		System.out.println("Age from Player" + super.age);// super should be used to access immediate parent only
		System.out.println("Age from IPLPlayer" + this.age);
//		super.sayMyName();
	}

}
