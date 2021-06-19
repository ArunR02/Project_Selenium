package SeleniumBasic_Ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch_Ex {

	public static void main(String[] args) {
		
		//property setting
		// Key - driver name
		// value - driver path / location		
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	//Interface			//Class 
	
	driver.get("https://www.amazon.in/");
	
	driver.getTitle();
	
	driver.getCurrentUrl();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.flipkart.com/");
	
	driver.navigate().back();
	
	driver.navigate().refresh();
	
	driver.navigate().forward();

	driver.getTitle();

	driver.close();
	
	driver.quit();
	
	driver.switchTo();
	
	}

}
