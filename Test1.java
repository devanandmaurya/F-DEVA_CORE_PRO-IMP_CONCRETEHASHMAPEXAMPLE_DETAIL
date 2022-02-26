package com.dkh.hascodeANDEQUALSMETHOD;

public class Test1 {
	public static void main(String[] args) {
		Human1 h1 = new Human1(12, "DEVAN");
		Human1 h2 = new Human1(13, "ajay");
		Human1 h3 = h1;
		System.out.println(h1 == h2); // false
		System.out.println(h1 == h3); // true
		// by using == operator we can check the reference of object are same or not
		// if same return true or false
		// EQUAL METHOD CHECK WHERATHER TWO OBJECT POINTED TO SAME REFERENCES
		// IT JUST CHECK THE IDENTITY

		//IF THE TWO REFERANCES ARE POINTING TO THE
		// THE SAME OBJECT, OBJECT CLASS EQUALS()METHOD WILL RETURN
		// TRUE OTHERWISE FALSE

		boolean value = h1.equals(h3);
		System.out.println(value); // true
		boolean value1 = h1.equals(h2);
		System.out.println(value1);// FALSE

		System.out.println("****************************************");
		String str1 = new String("devanand");
		String str2 = new String("Maurya");
		boolean v = str1.equals(str2);
		System.out.println(v);// false

		System.out.println("**IN THE STRING CLASS EQUALS"
		+ " METHOD " + "CHECK THE CONTENT"+" OF THE BOTH OBJECTS by referance*");
		String st = new String("devanand");
		String str = new String("devanand");
		boolean vv = st.equals(str);
		System.out.println(vv);// false
		System.out.println("**************************************");

		Human1 a = new Human1(12, "DEVAN");
		Human1 b = new Human1(12, "DEVAN");
		boolean bo = a.equals(b);
		System.out.println("here both name and adhar number same so true");
		System.out.println(bo); // false
		// Because both object reference are diff and content are same
		// in this case it goes to compare object class and object class
		// return content compare of equals().so output is false

		System.out.println("**************************************");

		Human1 c = new Human1(12, "DEVAN");
		Human1 d = new Human1(182, "AJAY ");
		boolean boole = c.equals(d);
		System.out.println("here both nama and adhar number not same so false");
		System.out.println(boole); // true

		// to overcome this we must have to override equals method code
		// @Override public boolean equals(Object obj) {return true;}
		// or own customs equals method with logic other wise always true
		// if content or same or not.

		System.out.println("**************************************");

		Human1 e = new Human1(152, "rajan");
		Human1 f = new Human1(182, "AJAY ");
		boolean bn = e.equals(f);
		// our equals method is not giving us any exception now ,rather we are
		// getting false as a result when we compare anything with null eg;
		// e.equals(null);
		System.out.println(bn); // false

		System.out.println("**************************************");

		Human1 g = new Human1(222, "raju");
		Human1 h = new Human1(872, "hunuman");
		Test1 t = new Test1();
		boolean bnn = g.equals(t);
		// our equals method is not giving us any exception now ,rather we are
		// getting false as a result when we compare anything with null eg;
		// e.equals(null);
		System.out.println("in case of another class compare "
				+ "then probem solved of class cast exp");
		System.out.println(bnn); // false

		System.out.println("**************************************");

		Human1 i = new Human1(702, "raja");
		Human1 j = new Human1(982, null);
		boolean bbb = i.equals(j);
		// our equals method is not giving us any exception now ,rather we are
		// getting false as a result when we compare anything with null eg;
		// e.equals(null);
		System.out.println("in case of another object having null"
				+ " value of name also create  logic for this written human1 class");
		System.out.println(bbb); // false

	}
}
