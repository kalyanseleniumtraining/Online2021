package exceptionExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITExample {
	
	
	public static void main(String[] args) throws Exception{
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://abcdpdf.com/en/png-to-pdf.html");
		
		driver.findElement(By.id("fileupload")).click();
		
		//this code will open command prompt window and execute the command
		cmd
		Runtime.getRuntime().exec("C:\\selenium code\\ABCD.exe");
		
		WebDriver driver=new ChromeDriver()
		
		
		
		
	}

}
