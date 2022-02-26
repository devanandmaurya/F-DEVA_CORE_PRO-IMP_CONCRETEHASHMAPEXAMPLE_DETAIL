package interfae.COM.DKH.BASE;

interface inner {
	int i = 90; // BY DEFULT ALLOWS ONLY THREE ACCESS MODI public static final int=40;
	public static final byte b = 45;

	public static void show() {
		System.out.println("this is default mehtod");
	}

	void dis();

	public default void getk() {
		System.out.println("i am a dfualt method of interface");
	}
}

public class Testss implements inner {

	@Override
	public void dis() {
		System.out.println("interface method call here ");
	}

	public static void main(String[] args) {
		Testss testss = new Testss();
		inner.show();// interface k name se static method ko object bana k call kar sakte hai
		// or without object banaye bhe call kar sakte hai
		testss.dis();
		testss.getk();
		System.out.println(testss.i + " ," + testss.b);

	}
}
