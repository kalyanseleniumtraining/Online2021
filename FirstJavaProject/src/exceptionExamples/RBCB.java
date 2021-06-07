package exceptionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RBCB {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		
		WebElement radioButton=driver.findElement(By.id("two"));

		radioButton.click();
		
		
		
//		WebElement checkbox = driver.findElement(By.name("permission"));
//		boolean state = checkbox.isSelected();//false
//
//		// unselect the checkbox
//
//		// true means selected
//		// false means unselected
//
//		if (state) {
//			checkbox.click();
//			
//		} else {
//			System.out.println("Checkbox is not selected so not performing any action");
//		}

	}

}
