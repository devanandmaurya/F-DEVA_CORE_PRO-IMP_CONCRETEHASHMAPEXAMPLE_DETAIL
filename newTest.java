package interfae.COM.DKH.BASE;
interface innerS {
	int i = 90; // BY DEFULT ALLOWS ONLY THREE ACCESS MODIfires public static final int=40;
	public static final byte b = 45;

	default void show() {
		System.out.println("this is default mehtod");
	}

	void dis();
}
interface in2{
	void distt();
}
public class newTest implements innerS ,in2{
	//MULTIPLE INHERITENCE SUPPORT HERE
   @Override
	public void dis() {
		System.out.println("interface method call here dis() from inners!! ");
	}
	@Override
	public void distt() {
System.out.println("this is new in2 interace  method call distt");		
	}
	public static void main(String[] args) {
		newTest testss = new newTest();
		testss.dis();
		testss.show();
		testss.distt();
		System.out.println("The i and b values is:"+testss.i + " ," + testss.b);
	}
}