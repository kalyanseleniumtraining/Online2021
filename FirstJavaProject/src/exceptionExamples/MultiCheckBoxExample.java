package exceptionExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiCheckBoxExample {
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		
		List<WebElement> checkboxes= driver.findElements(By.xpath(".//input[@type='checkbox' and starts-with(@value,'Y')]"));
		
		for(int i=0;i<checkboxes.size();i++)
		{
			WebElement checkbox=checkboxes.get(i);
			if(!checkbox.isSelected())
			{
				checkbox.click();
				
			}
			
		}
		
	}

}
