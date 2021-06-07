package exceptionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.print.attribute.IntegerSyntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortingExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains/14317/");

		List<WebElement> rows = driver.findElements(By.xpath(".//table[@class='results']/tbody/tr"));

		System.out.println(rows.size());// 30

		for (int i = 1; i <= rows.size(); i++) {
			List<WebElement> cols = driver.findElements(By.xpath(".//table[@class='results']/tbody/tr[" + i + "]/td"));

			for (int j = 1; j <=cols.size(); j++) {
				WebElement value = driver
						.findElement(By.xpath(".//table[@class='results']/tbody/tr[" + i + "]/td[" + j + "]"));
				String colValue = value.getText();
				System.out.print(colValue);
				System.out.print("--");

			}
			System.out.println();

		}

//		List<String> li=new ArrayList<String>();
//		li.add("AB");
//		li.add("DS");
//		li.add("AC");
//		li.add("BC");
//		li.add("DF");

	}

}
