package firstJavaPackage;

public class FirstJavaClass {

	int i = 10;
	double d = 100.45;
	String s = "Automation";
	char ch = 'z';
	boolean b = true;

	public void addnames(String s1,String s2) {
		
		String s3 = s1 + s2;
		System.out.println(s3);

	}

	public static void main(String[] args) {
		// object

		FirstJavaClass obj1 = new FirstJavaClass();

		System.out.println(obj1.i);
		System.out.println(obj1.d);
		System.out.println(obj1.s);
		System.out.println(obj1.ch);
		System.out.println(obj1.b);
		//pavan is accessing the method
		obj1.addnames("selenium ", "webdriver");
		//akhila is accesing the method
		obj1.addnames("API ", "Testing");

	}

}
