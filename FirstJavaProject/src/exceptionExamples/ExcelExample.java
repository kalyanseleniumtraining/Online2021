package exceptionExamples;

import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelExample {

	// methods

	public void searchEbay(WebDriver driver, String searchValue, String expectedTitle) {
		WebElement ebaySearchBx = driver.findElement(By.id("gh-ac"));
		ebaySearchBx.sendKeys(searchValue);

		WebElement ebaySearchBtn = driver.findElement(By.id("gh-btn"));
		ebaySearchBtn.click();

		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println(searchValue + " page opened - Test case Pass");
		} else {
			System.err.println(searchValue + " page not opened - Test case Fail");
		}
		driver.navigate().back();
	}

	public static void main(String[] args) throws Exception {

		ExcelExample ee = new ExcelExample();

		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");

		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\kalya.000\\Desktop\\TestExcel.xlsx");

		XSSFSheet sh = wb.getSheet("TestData");

		int rowCount = sh.getPhysicalNumberOfRows();

		for (int i = 1; i < rowCount; i++) {
			String searchValue = sh.getRow(i).getCell(0).getStringCellValue();
			String expectedTitle = sh.getRow(i).getCell(1).getStringCellValue();

			ee.searchEbay(driver, searchValue, expectedTitle);

		}

	}

}
