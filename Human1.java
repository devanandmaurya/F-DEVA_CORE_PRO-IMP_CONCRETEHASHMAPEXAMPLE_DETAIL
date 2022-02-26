package com.dkh.hascodeANDEQUALSMETHOD;

public class Human1 {
	public int adharNumber;
	public String name;

	public Human1(int adharNumber, String name) {
		this.adharNumber = adharNumber;
		this.name = name;

		System.out.println("The adhar number" + adharNumber + " " + "the name is  " + name);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adharNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human1 other = (Human1) obj;
		if (adharNumber != other.adharNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
/*	@Override
	public int hashCode() {
		return adharNumber;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		if (obj == null) {
			
			return false;
		}
		Human1 humm = (Human1) obj;
		if (this.adharNumber != humm.adharNumber) {
			return false;
		}
		if (this.name == null) {
			if (humm.name != null) {
				return false;
			}
		}

		if (!this.name.equals(humm.name)) {
			return false;
		}

		return true;*/

	
	//we can also write all the hascode and equals method code 
//by eclips sorce generate equls and hascoode method/
	
	

