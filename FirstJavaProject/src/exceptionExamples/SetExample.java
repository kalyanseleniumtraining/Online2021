package exceptionExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	
	
	public static void main(String[] args) {
		
		Set<String> veg = new LinkedHashSet<String>();     
	      
        veg.add("India"); 
        veg.add("USA");
        veg.add("UK");     
        veg.add("Russia");     
        veg.add("China");     
      
        for(String str: veg)
        {
        	System.out.println(str);
        	
        }
		
		
		
		
	}

}
