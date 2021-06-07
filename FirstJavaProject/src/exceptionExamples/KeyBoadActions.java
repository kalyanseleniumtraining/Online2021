package exceptionExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoadActions {
	
	
	public static void main(String[] args) throws Exception{
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\kalya.000\\Desktop\\msedgedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.linkText("My eBay"));
		
		act.moveToElement(ele).perform();
		
		
		WebElement messagelink=driver.findElement(By.linkText("Messages"));
		
		
		act.click(messagelink).perform();
		
		act.contextClick(messagelink).perform();
		
		act.doubleClick(messagelink).perform();
		
		
		
		
//		WebElement ele1=driver.findElement(By.id("nav-logo-sprites"));
//		WebElement ele2=driver.findElement(By.xpath("//*[@class='nav-logo-base nav-sprite']"));
//		
//		act.dragAndDrop(ele1, ele2).perform();
//		
		
		
		
		
//		//enum is used to store key and value
//		act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
		
	}

}
