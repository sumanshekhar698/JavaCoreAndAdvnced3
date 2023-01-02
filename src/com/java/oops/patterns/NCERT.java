package com.java.oops.patterns;

public class NCERT {

	private  String about;
	static boolean isInstantiated = false;
	static NCERT ncertObject;

//	What is the use of a private constructor
	private NCERT(String about) {
		super();
		this.about = about;
	}

	static NCERT createSingleObjectOnly(String about) {

		if (isInstantiated == false) {
			ncertObject = new NCERT(about);
			isInstantiated = true;
			return ncertObject;
		} else {
			return ncertObject;
		}

	}

	@Override
	public String toString() {
		return "NCERT [about=" + about + "]";
	}

}
