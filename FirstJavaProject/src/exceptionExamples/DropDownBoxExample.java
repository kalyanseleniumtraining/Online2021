package exceptionExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");

		WebElement drowDown = driver.findElement(By.id("gh-cat"));

		Select sel = new Select(drowDown);
		
		List<WebElement> items=sel.getOptions();
		
		for(int i=0;i<items.size();i++)//29
		{
			String item=items.get(i).getText();//xyz
			
			if(item.equals("Music"))
			{
				System.out.println("Item found");
				break;
			}
			else if(i==items.size()-1)
			{
				System.out.println("Item not found");
			}
			
		}
		
		
		
		
		
		
		
		
		
//		// sel.selectByIndex(4);//books
//
//		// sel.selectByVisibleText("art");
//
//		// sel.selectByValue("14339");
//
//		List<WebElement> items = sel.getOptions();
//		System.out.println(items.size());
//
//		for (int i = 0; i < items.size(); i++) {
//			String item = items.get(i).getText();
//			if (item.equals("Music")) {
//				System.out.println("Item found");
//			} else {
//				System.out.println("Item not found");
//			}
//
//		}
//
////		WebElement defaultElement = sel.getFirstSelectedOption();
////
////		String defaultText = defaultElement.getText();
//
////		
////		if (defaultText.equals("All Categories")) {
////			System.out.println("Test case pass - Default value matched");
////		} else {
////			System.err.println("Test case fail - Default value not matched");
////		}

	}

}
