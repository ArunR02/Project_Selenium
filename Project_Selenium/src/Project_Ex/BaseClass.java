package Project_Ex;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	// 1.Browser launch

	public static WebDriver browserLaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else {

			System.out.println("Invalid browser name");
		}
		driver.manage().window().maximize();

		return driver;
	}

	// 2.close

	public static void close() {
		driver.close();
	}

	// 3.Quit
	public static void quit() {
		driver.quit();
	}

	// 4.Navigate to
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// 5.Navigate back
	public static void navigateBack() {
		driver.navigate().back();
	}

	// 6.Navigate forward
	public static void navigateForward() {
		driver.navigate().forward();
	}

	// 7.Navigate refresh
	public static void navigatereFresh() {
		driver.navigate().refresh();
	}

	// 8.Get
	public static void get(String url) {
		driver.get(url);
	}

	// 10.Actions
	public static void actions(WebElement element, String methodtype) {
		if (methodtype.equalsIgnoreCase("moveToElement")) {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
		} else if (methodtype.equalsIgnoreCase("click")) {
			Actions a = new Actions(driver);
			a.click(element).build().perform();
		}
	}
	// 11.frame
	/*
	 * public static void frame(WebElement element, String methodtype) { if
	 * (methodtype.equalsIgnoreCase("moveToElement")) { Actions a = new
	 * Actions(driver); a.moveToElement(element).build().perform(); } else if
	 * (methodtype.equalsIgnoreCase("click")) { Actions a = new Actions(driver);
	 * a.click(element).build().perform(); } }
	 */

	// 14.drop down
	public static void dropdown(WebElement element, String methodtype, String value) {
		Select s = new Select(element);
		if (methodtype.equalsIgnoreCase("selectByValue")) {
			s.selectByValue(value);
		} else if (methodtype.equalsIgnoreCase("selectByIndex")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (methodtype.equalsIgnoreCase("selectByVisibleText")) {
			s.selectByVisibleText(value);
		}

	}

	// 27.sendKeys
	
	public static void sendKeys(WebElement element, String values) {
		element.sendKeys(values);
	}

	// 31.Click()
	public static void click(WebElement element) {
		element.click();
	}

}
