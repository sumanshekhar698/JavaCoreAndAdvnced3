package com.java.oops.polymorphism;

import java.util.Scanner;
//import java.util.*;

public class Shape {

	// Polymorphism methods will be eventually* unique
	double shape(float radius, int dummy) {
//		return 3.14f * radius * radius;
		return Math.PI * Math.pow(radius, 2);
	}

	float shape(int dummy, float side) {
		return side * side;
	}

	// Below 2 methods have same name but thier overall signature is unique
//	name
//	no of parameters
//	type of the parameter
//	position of parameter

	double shape(float base, float height) {
		return 0.5 * base * height;
	}

	double shape(float top, float base, float height) {
//		return 3.14f * radius * radius;
		return 0.5 * height * (top + base);
	}

}
