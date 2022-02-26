package com.dkh.hascodedemo;

public class Human {

	public int adharNumber;
	public String name;

	public Human(int adharNamuber, String name) {
		this.adharNumber = adharNamuber;
		this.name = name;

		System.out.println(" The adhar number is: " + adharNamuber + " The name is : " + name);

	}

	@Override
	public int hashCode() {
		// return 12300;
		return adharNumber;
	}
}
