package com.org.dk.wh;

class Outer {

	public class Inner {
		public void m1() {
			System.out.println("This is iner class method");
		}
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}
}