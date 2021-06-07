package exceptionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusExample {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://redbus.in");
		
		WebElement toStation=driver.findElement(By.xpath(".//input[@class='db' and @id='dest']"));
		
		toStation.sendKeys("Hyderabad");
		
	}

}
