package exceptionExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartExamplr {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		List<WebElement> mobileNames=driver.findElements(By.className("skhfkljsadhkfjhdsak"));
		System.out.println(mobileNames.size());
//		for(int i=0;i<mobileNames.size();i++)
//		{
//			System.out.println(mobileNames.get(i).getText());
//		}
		
		
		
	}

}
