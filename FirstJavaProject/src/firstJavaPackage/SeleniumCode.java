package firstJavaPackage;

import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.in");
		int count = 0;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// 100
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {

			if (!links.get(i).getText().equals("")) {
				count = count + 1;
				System.out.println(links.get(i).getText());
			}

		}
		System.out.println("Total no of links with text are :" + count);

	}

}
