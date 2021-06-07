package exceptionExamples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHExample {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://naukri.com");//3 windows
		
		
		
		Set<String> ids=driver.getWindowHandles();
		
		for(String id: ids)
		{
		//this line of code will make inactive window as active window based on id which we are passing
			driver.switchTo().window(id);
			String title=driver.getTitle();
			if(title.equals("Cognizant"))
			{
				WebElement ele=driver.findElement(By.xpath(".//*[@alt='Cognizant']"));
				
				ele.click();
				
			}
			
		}
		
		
	}

}
