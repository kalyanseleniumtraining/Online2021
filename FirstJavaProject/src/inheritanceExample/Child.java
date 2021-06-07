package inheritanceExample;

public class Child extends Parent{
	
	
	public void sub() {
		
		
		int a=1000;
		int b=500;
		int c=a-b;
		System.out.println(c);
		
	}
	
	
	
	public static void main(String[] args) {
		Child ch=new Child();
		ch.add(100, 200);
		Parent p=new Parent();
	    p.sub();	
	
	}
	
	

	
	
	

}
