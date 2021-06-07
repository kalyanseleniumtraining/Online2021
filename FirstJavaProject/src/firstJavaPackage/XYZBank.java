package firstJavaPackage;

public class XYZBank {

	String username="Akhila";//instance variable
	String accountnumber="A1";
	String password="abcd";
	String balance="20000";
	
	public int add(int a,int b)
	{
		
		int c=a+b;//local variable
		System.out.println(c);
		return c;
	}
	
	
	public static void main(String[] args) {
		
		XYZBank akhilaAccount=new XYZBank();
	
		int c=akhilaAccount.add(5, 5);
		
		
		
		
		
	}
	
	
	
	
	
	
}
