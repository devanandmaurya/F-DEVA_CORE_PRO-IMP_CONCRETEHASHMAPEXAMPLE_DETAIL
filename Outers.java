package com.org.dk.wh;

public class Outers {

	static int s = 10;
	int t = 50;

	class Newinner {
		public void m() {
			System.out.println(s);
			System.out.println(t);
		}
	}

	public static void main(String[] args) {

		new Outer().new Inner().m1();
		System.out.println("-------------");
	}
}