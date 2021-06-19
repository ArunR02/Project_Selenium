package SeleniumBasic_Ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Ex {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().window().maximize();

		// All Data

		List<WebElement> alldata = driver.findElements(By.xpath("(//table/tbody/tr/td)"));
		System.out.println("***All Data***");

		for (WebElement we_alldata : alldata) {

			String textalldata = we_alldata.getText();
			System.out.println(textalldata);
		}

		// RowData
		System.out.println("***First Row***");
		List<WebElement> firstrow = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));

		for (WebElement we_firstrow : firstrow) {
			String textfirstrow = we_firstrow.getText();
			System.out.println(textfirstrow);
		}
		// ColumnData
		System.out.println("***first Column***");
		List<WebElement> firstcolumn = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));

		for (WebElement we_firstcolumn : firstcolumn) {
			String textfirstrow = we_firstcolumn.getText();
			System.out.println(textfirstrow);
		}
			// particular value
			System.out.println("***particular value***");
			WebElement particularvalue = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
			System.out.println(particularvalue.getText());
		
		}

	}

