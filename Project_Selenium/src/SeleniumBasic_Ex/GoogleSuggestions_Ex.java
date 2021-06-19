package SeleniumBasic_Ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions_Ex {

	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\a1rajend\\Desktop\\Green Tech\\work space\\Project_Selenium\\new browser\\ChromeSetup.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
    WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
    searchbox.sendKeys("amazon");
	
    
	
}
}