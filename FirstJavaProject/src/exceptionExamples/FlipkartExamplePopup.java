package exceptionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartExamplePopup {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		Thread.sleep(2000);
		
		
		WebElement popupCloseButton=driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']"));
		popupCloseButton.click();
	}

}
