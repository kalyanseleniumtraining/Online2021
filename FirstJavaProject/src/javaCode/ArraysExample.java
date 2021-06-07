package javaCode;

import java.util.ArrayList;
import java.util.List;

public class ArraysExample {
	
	
	public static void main(String[] args) {
		
		
		List<String> li=new ArrayList<String>();
		
		li.add("Pavan");
		li.add("Akhila");
		li.add("Madhu");
		li.add("Kalyan");
		
		
		li.remove(3);
		
		
		System.out.println(li.get(0));
		System.out.println(li.get(1));
		System.out.println(li.get(2));
		
		
		
	}

}
