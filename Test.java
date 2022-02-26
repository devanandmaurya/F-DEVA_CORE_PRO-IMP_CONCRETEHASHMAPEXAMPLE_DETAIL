package com.dkh.hascodedemo;

public class Test {

	public static void main(String[] args) {
		/*
		 * Human h = new Human(123456, "devanand"); int a = h.hashCode();
		 * System.out.println("The object of h is:" + h);
		 * System.out.println("The object of a hashcode:" + a); Human hu = new
		 * Human(123, "Ahjay"); int b = hu.hashCode();
		 * System.out.println("The object of hu is:" + hu);
		 * System.out.println("The object of b hashcode:" + b); Human hum = new
		 * Human(156, "neeta"); int c = hum.hashCode();
		 * System.out.println("The object of hum is:" + hum);
		 * System.out.println("The object of c hashcode:" + c);
		 */

		String st = new String("Devanand m");
		int sthashcodevalue = st.hashCode();
		System.out.println("hash code value of st :" + sthashcodevalue);
		String st1 = new String("Poonam P");
		int st1hashcodevalue = st1.hashCode();
		System.out.println("hash code value of st1 :" + st1hashcodevalue);
	
	System.out.println("***************************************");
	//  String a="AB";
  //String b="AB";
  
  String a="ABCD";
  String b="ABasd ";
  
  System.out.println(a.hashCode()+ " " + b.hashCode());
  
  
	
	}

}
