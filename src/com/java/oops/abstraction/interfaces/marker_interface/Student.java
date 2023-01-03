package com.java.oops.abstraction.interfaces.marker_interface;

public class Student implements Cloneable {
	String name;
	int id;

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
