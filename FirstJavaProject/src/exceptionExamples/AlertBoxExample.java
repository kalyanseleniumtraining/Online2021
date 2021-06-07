package exceptionExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertBoxExample {

	public static void main(String[] args) {

		int number=100;
		
		int rem=0;
		for(int i=1;i<=number;i++)
		{
			int temp=0;
			for(int j=1;j<=i;j++)
			{ 
				rem=i%j;
				if(rem==0)
				{
					temp=temp+1;
				}
			}
			if(temp==2)
			{
				System.out.println(i);
			}
		}

	}

}
