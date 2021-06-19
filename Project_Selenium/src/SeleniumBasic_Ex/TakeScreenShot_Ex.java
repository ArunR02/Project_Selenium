package SeleniumBasic_Ex;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot_Ex {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("arun.raghul@yahoo.com");
		
		WebElement password = driver.findElement(By.name("pass")); 
		
		password.sendKeys("123456");
		
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		
		login.click();
		
		
		// interface
		TakesScreenshot ts = (TakesScreenshot) driver; // narrow casting
	    
		
		// method
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		//destination
		
		File destination = new File("C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\ScreenShot\\facebook.png");
		
		//file utils
		
		FileUtils.copyFile(source, destination);
		
	}
	
	
}
