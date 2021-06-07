package exceptionExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\selenium code\\March2021 Batch\\FirstJavaProject\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.id("identifierId"));// available immediately-- continue
		ele1.sendKeys("kalyan");
		WebElement ele2 = driver.findElement(By.xpath(".//*[text()='Next']//parent::button"));// not available==use
																								// implicitly wait
		ele2.click();

		// explicit wait
		// explicit wait will wait for multiple conditions

		// how to declare explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 25);

		boolean state = wait.until(ExpectedConditions.titleContains("ABCD"));

		if (state == true) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not matched");
		}

		WebElement ele3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

		ele3.sendKeys("abcd");

	}

}
