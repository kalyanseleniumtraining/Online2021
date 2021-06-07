package firstJavaPackage;

public class Addition {

	// in this class i will create 3 methods to add numbers

	// 1st method adds two numbers

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	// 2nd method will add three numbers
	public void add(int a, int b,int c) {
		System.out.println(a + b+c);
	}

	public void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	
	public static void main(String[] args) {
		
		Addition a=new Addition();
		
		a.add(10, 20,30,40);
		a.add(10, 20,30);
		
		
		
	}
	
	
}
