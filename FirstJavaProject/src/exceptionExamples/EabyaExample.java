package exceptionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class EabyaExample {
	
	
	public static void main(String[] args) {
		
		
		List<String> li=new ArrayList<String>();
		li.add("AB");
		li.add("DS");
		li.add("AC");
		li.add("BC");
		li.add("DF");
		//AB AC BC DF DS
		
		Collections.sort(li, Collections.reverseOrder());
		
		System.out.println(li);
		
		li.equals(li2);
		
		
		
		
	}

}
